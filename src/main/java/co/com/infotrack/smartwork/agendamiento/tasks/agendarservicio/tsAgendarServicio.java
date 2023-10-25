package co.com.infotrack.smartwork.agendamiento.tasks.agendarservicio;

import co.com.infotrack.smartwork.agendamiento.models.agendarservicio.AgendarServicio;
import co.com.infotrack.smartwork.agendamiento.models.agendarservicio.UsuarioAplicacion;
import co.com.infotrack.smartwork.agendamiento.utils.ConfiguracionToken;
import co.com.infotrack.smartwork.agendamiento.utils.JsonUtil;
import co.com.infotrack.smartwork.agendamiento.utils.RestService;
import io.restassured.RestAssured;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.io.IOException;

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


        UsuarioAplicacion usuarioApp = new UsuarioAplicacion("224727e8-256e-4c6c-8ec5-add0905d8c36", "47d707fa-9442-4eb3-a6cc-0ddad89f4c2d");
        UsuarioAplicacion.Solicitud solicitud = new UsuarioAplicacion.Solicitud(agendarServicio, usuarioApp);
        String jsonBody = JsonUtil.toJson(solicitud);
        String token = ConfiguracionToken.properties.getProperty("AUTH_TOKEN");


        String baseUrl = RestService.BASE_URL.toString() + RestService.AGENDAR_SERVICIOS.toString();

        /**
         * Habilidad para poder manipular las Apis.
         * */
        actor.can(CallAnApi.at(baseUrl));


//        System.out.println("BASE_URL: " + RestService.BASE_URL);
//        System.out.println("AGENDAR_SERVICIOS: " + RestService.AGENDAR_SERVICIOS);
//        System.out.println("Token: " + token);
//        System.out.println("jsonBody: " + jsonBody);
//        System.out.println("baseUrl: "+baseUrl);

        actor.attemptsTo(
                    Post.to(baseUrl)
                            .with(request -> request
                                    .header("Authorization", "Bearer " + token)
                                    .contentType("application/json")
                                    .body(jsonBody)
                                    .log().all()
                            )
            );

    }
}

