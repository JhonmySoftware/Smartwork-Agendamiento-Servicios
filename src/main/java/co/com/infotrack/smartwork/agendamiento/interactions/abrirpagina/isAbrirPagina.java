package co.com.infotrack.smartwork.agendamiento.interactions.abrirpagina;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.abrirpagina.ObjectAbrirPagina;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class isAbrirPagina implements Task {


    private ObjectAbrirPagina objectAbrirpagina;

    public static isAbrirPagina one() {
        return Tasks.instrumented(isAbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        /**
         * Proceso de limpiado para el sitio.
         * */
        getDriver().manage().deleteAllCookies(); // Eliminar la cookie del sitio
        getDriver().navigate().refresh(); // Refrescar el sitio
        actor.attemptsTo(Open.browserOn(objectAbrirpagina));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
