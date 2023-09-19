package co.com.infotrack.smartwork.agendamiento.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.ObjectAbrirPagina;

public class isAbrirPagina implements Task {


    private ObjectAbrirPagina objectAbrirpagina;

    public static isAbrirPagina one() {
        return Tasks.instrumented(isAbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(objectAbrirpagina));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
