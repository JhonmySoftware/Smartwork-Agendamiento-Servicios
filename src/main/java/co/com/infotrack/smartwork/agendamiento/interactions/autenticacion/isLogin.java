package co.com.infotrack.smartwork.agendamiento.interactions.autenticacion;

import co.com.infotrack.smartwork.agendamiento.questions.autenticacion.qsLogin;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.autenticacion.ObjetcLogin;
import co.com.infotrack.smartwork.agendamiento.utils.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.hamcrest.Matchers;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class isLogin implements Interaction {


    public static isLogin one() {
        return instrumented(isLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Credenciales.Credenciales();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /**
         * Realizar el login del sitio infotrack
         * */
        actor.attemptsTo(Wait.until(
                        WebElementQuestion.the(ObjetcLogin.InputLogin),
                        WebElementStateMatchers.isVisible()
                ).forNoLongerThan(20).seconds(),
                Enter.theValue(Credenciales.properties.getProperty("Usuario")).into(ObjetcLogin.InputLogin),
                Enter.theValue(Credenciales.properties.getProperty("Contrasenia")).into(ObjetcLogin.InputPassword),
                Click.on(ObjetcLogin.ButtonIniciarSesion));

        /**
         * Validar inicion de sesión y versionamiento del sitio
         * */
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(qsLogin.one(),
                Matchers.comparesEqualTo("1.5.9")));
    }
}
