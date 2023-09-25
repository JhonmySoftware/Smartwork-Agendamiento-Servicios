package co.com.infotrack.smartwork.agendamiento.interactions.autenticacion;

import co.com.infotrack.smartwork.agendamiento.userinterfaces.autenticacion.ObjetcCerrarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class isCerrarSesion implements Interaction {

    public static isCerrarSesion one() {
        return instrumented(isCerrarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.until(
                        WebElementQuestion.the(ObjetcCerrarSesion.Perfil),
                        WebElementStateMatchers.isVisible()
                ).forNoLongerThan(10).seconds(),
                Click.on(ObjetcCerrarSesion.Perfil),
                Click.on(ObjetcCerrarSesion.CerrarSesion));
    }
}
