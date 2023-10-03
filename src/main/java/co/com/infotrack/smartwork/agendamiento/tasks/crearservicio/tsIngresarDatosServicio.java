package co.com.infotrack.smartwork.agendamiento.tasks.crearservicio;

import co.com.infotrack.smartwork.agendamiento.models.OrdenDeServicio;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio.ObjectDatosServicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

public class tsIngresarDatosServicio implements Task {

    private final OrdenDeServicio ordenDeServicio;

    public tsIngresarDatosServicio(OrdenDeServicio ordenDeServicio) {
        this.ordenDeServicio = ordenDeServicio;
    }

    public final static tsIngresarDatosServicio conEstosDatos2(OrdenDeServicio ordenDeServicio) {
        return new tsIngresarDatosServicio(ordenDeServicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(ObjectDatosServicio.codigoServicio),
                        WebElementStateMatchers.isVisible()).forNoLongerThan(10).seconds(),
                Scroll.to(ObjectDatosServicio.codigoServicio),
                Enter.theValue(ordenDeServicio.getCodigoServicio()).into(ObjectDatosServicio.codigoServicio)
        );
    }
}
