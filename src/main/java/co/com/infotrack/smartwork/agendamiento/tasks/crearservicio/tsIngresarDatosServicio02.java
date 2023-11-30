package co.com.infotrack.smartwork.agendamiento.tasks.crearservicio;

import co.com.infotrack.smartwork.agendamiento.models.crearservicio.OrdenDeServicio;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio.ObjectDatosServicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

public class tsIngresarDatosServicio02 implements Task {

    private final OrdenDeServicio ordenDeServicio;

    public tsIngresarDatosServicio02(OrdenDeServicio ordenDeServicio) {
        this.ordenDeServicio = ordenDeServicio;
    }

    public final static tsIngresarDatosServicio02 conEstosDatos2(OrdenDeServicio ordenDeServicio) {
        return new tsIngresarDatosServicio02(ordenDeServicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(ObjectDatosServicio.codigoServicio),
                        WebElementStateMatchers.isVisible()).forNoLongerThan(10).seconds(),
                Scroll.to(ObjectDatosServicio.codigoServicio),
                Enter.theValue(ordenDeServicio.getCodigoServicio()).into(ObjectDatosServicio.codigoServicio)
        );

        // Seleccionar clase del servicio, tipo de servicio y prioridad
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(ObjectDatosServicio.ClaseServicio),
                        WebElementStateMatchers.isVisible()).forNoLongerThan(10).seconds(),
                Enter.theValue(ordenDeServicio.getClaseServicio()).into(ObjectDatosServicio.ClaseServicio),
                Click.on(ObjectDatosServicio.ListaClaseServicio),
                Enter.theValue(ordenDeServicio.getTipoServicio()).into(ObjectDatosServicio.IdTipoServicio),
                Click.on(ObjectDatosServicio.ListaIdTipoServicio),
                Enter.theValue(ordenDeServicio.getPrioridad()).into(ObjectDatosServicio.Prioridad),
                Click.on(ObjectDatosServicio.ListPrioridad)
        );

        // Seleccionar Hora inicio y Hora Fin del servicio
        actor.attemptsTo(Enter.theValue(ordenDeServicio.getHoraInicio()).into(ObjectDatosServicio.HoraInicio),
                Enter.theValue(ordenDeServicio.getHoraFin()).into(ObjectDatosServicio.HoraFin),
                Enter.theValue(ordenDeServicio.getZonas()).into(ObjectDatosServicio.Zonas),
                Click.on(ObjectDatosServicio.ListaZonas),
                Enter.theValue(ordenDeServicio.getObservacion()).into(ObjectDatosServicio.Observacion));
    }
}
