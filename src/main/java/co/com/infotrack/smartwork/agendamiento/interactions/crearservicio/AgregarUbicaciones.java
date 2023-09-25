package co.com.infotrack.smartwork.agendamiento.interactions.crearservicio;

import co.com.infotrack.smartwork.agendamiento.models.OrdenDeServicio;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio.ObjectAgregarUbicaciones;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

public class AgregarUbicaciones implements Interaction {

    private final OrdenDeServicio ordenDeServicio;

    public AgregarUbicaciones(OrdenDeServicio ordenDeServicio) {
        this.ordenDeServicio = ordenDeServicio;
    }

    public final AgregarUbicaciones one() {
        return Instrumented.instanceOf(AgregarUbicaciones.class).withProperties();
    }

    public static Performable conEstosDatos(OrdenDeServicio ordenDeServicio) {
        return new AgregarUbicaciones(ordenDeServicio);
        // return new AgregarUbicaciones(ordenDeServicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ObjectAgregarUbicaciones.AgregarDireccion),
                Click.on(ObjectAgregarUbicaciones.AgregarDireccion),
                Click.on(ObjectAgregarUbicaciones.Mismosdatosprincipal),
                Wait.until(
                        WebElementQuestion.the(ObjectAgregarUbicaciones.Direccion),
                        WebElementStateMatchers.isVisible()
                ).forNoLongerThan(10).seconds(),
                Enter.theValue(ordenDeServicio.getUbicacion()).into(ObjectAgregarUbicaciones.Direccion),
                Enter.theValue(ordenDeServicio.getComplemento()).into(ObjectAgregarUbicaciones.Complemento),
                Click.on(ObjectAgregarUbicaciones.GuardarDireccion),
                Click.on(ObjectAgregarUbicaciones.ContinuarDireccion),
                Wait.until(
                        WebElementQuestion.the(ObjectAgregarUbicaciones.VolverForumlarioServicio),
                        WebElementStateMatchers.isVisible()
                ).forNoLongerThan(30).seconds(),
                Click.on(ObjectAgregarUbicaciones.VolverForumlarioServicio));
    }
}
