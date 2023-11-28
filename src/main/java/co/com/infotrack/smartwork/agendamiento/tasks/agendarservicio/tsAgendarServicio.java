package co.com.infotrack.smartwork.agendamiento.tasks.agendarservicio;

import co.com.infotrack.smartwork.agendamiento.abilities.ApiAbility;
import co.com.infotrack.smartwork.agendamiento.models.agendarservicio.AgendarServicio;
import co.com.infotrack.smartwork.agendamiento.models.agendarservicio.UsuarioAplicacion;
import co.com.infotrack.smartwork.agendamiento.utils.ConfiguracionToken;
import co.com.infotrack.smartwork.agendamiento.utils.JsonUtil;
import co.com.infotrack.smartwork.agendamiento.utils.LecturaArchivosProperties;
import co.com.infotrack.smartwork.agendamiento.utils.RestService;
import io.restassured.RestAssured;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.io.IOException;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.hasItems;

public class tsAgendarServicio implements Task {

    static {
        // Configura RestAssured para confiar en certificados SSL no seguros
        RestAssured.useRelaxedHTTPSValidation();
    }

    private final AgendarServicio agendarServicio;

    public tsAgendarServicio(AgendarServicio agendarServicio) {
        this.agendarServicio = agendarServicio;
    }

    public static tsAgendarServicio conEstosDatos(AgendarServicio agendarServicio) {
        return Tasks.instrumented(tsAgendarServicio.class, agendarServicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            ConfiguracionToken.ConfiguracionToken();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            LecturaArchivosProperties.VersionSitio();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        UsuarioAplicacion usuarioApp = new UsuarioAplicacion(LecturaArchivosProperties.properties.getProperty("IdAplicacion"),
                LecturaArchivosProperties.properties.getProperty("IdUsuario"));
        UsuarioAplicacion.Solicitud solicitud = new UsuarioAplicacion.Solicitud(agendarServicio, usuarioApp);
        String jsonBody = JsonUtil.toJson(solicitud);
        final String token = ConfiguracionToken.properties.getProperty("AUTH_TOKEN");


        String baseUrl = RestService.getFullAgendarServiciosUrl();

        /**
         * Habilidad para poder manipular las Apis.
         */
        // actor.can(CallAnApi.at(baseUrl));
        ApiAbility.giveApiAbilityTo(actor, baseUrl);

        //System.out.println("Token: " + token);
        //System.out.println("jsonBody: " + jsonBody);
        //System.out.println("baseUrl: " + baseUrl);

        actor.attemptsTo(
                Post.to("")
                        .with(request -> request
                                .header("Authorization", "Bearer " + token)
                                .header("Content-Type", "application/json; charset=utf-8")
                                .body(jsonBody)
                                .log().all()
                        )
        );

        actor.should(
                seeThatResponse("Validación codigo de respuesta y creación del servicio :" + agendarServicio.getIdServicio(),
                        response -> response.statusCode(200)
                                .body("Mensajes", hasItems("El servicio " + agendarServicio.getIdServicio() + " ha sido asignado con éxito.")))
        );


    }
}

