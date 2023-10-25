package co.com.infotrack.smartwork.agendamiento.interactions.crearservicio;

import co.com.infotrack.smartwork.agendamiento.models.crearservicio.OrdenDeServicio;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio.ObjectAgregarUbicaciones;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio.ObjectCrearServicio;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
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

    public static AgregarUbicaciones conEstosDatos(OrdenDeServicio ordenDeServicio) {
        return new AgregarUbicaciones(ordenDeServicio);
        // return new AgregarUbicaciones(ordenDeServicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ObjectAgregarUbicaciones.AgregarDireccion),
                Wait.until(
                        WebElementQuestion.the(ObjectAgregarUbicaciones.AgregarDireccion),
                        WebElementStateMatchers.isVisible()
                ).forNoLongerThan(10).seconds(),
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

//        // Limpiar Formulario y buscar de nuevo la cedula
//        actor.attemptsTo(Wait.until(WebElementQuestion.the(ObjectAgregarUbicaciones.LimpiarFormulario),
//                WebElementStateMatchers.isVisible()).forNoLongerThan(10).seconds(),
//                Click.on(ObjectAgregarUbicaciones.LimpiarFormulario));
//
//        // Volver al buscar el mismo cliente creado
//        //Ingresa la información de tipo de identificación e identificación y formulario del cliente
//        actor.attemptsTo(Click.on(ObjectCrearServicio.TipoIdentificacion));
//        try {
//            switch (ordenDeServicio.getTipoIdentificacion()) {
//                case "Cédula de ciudadanía":
//                    actor.attemptsTo(Click.on(ObjectCrearServicio.CedulaCiudadania));
//                    break;
//                case "Cédula de extranjería":
//                    actor.attemptsTo(Click.on(ObjectCrearServicio.CedulaExtranjeria));
//                    break;
//                case "NIT":
//                    actor.attemptsTo(Click.on(ObjectCrearServicio.NIT));
//                    break;
//                default:
//                    System.out.println("Tipo de identificación inválido");
//                    break;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Ocurrió un error al intentar hacer clic en el elemento: " + e.getMessage());
//        }
//
//        actor.attemptsTo(Enter.theValue(ordenDeServicio.getIdentificacion()).into(ObjectCrearServicio.Identificacion));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(ObjectCrearServicio.BuscarCliente),
                        WebElementStateMatchers.isVisible()).forNoLongerThan(10).seconds(),
                Scroll.to(ObjectCrearServicio.BuscarCliente),
                Click.on(ObjectCrearServicio.BuscarCliente),
                Click.on(ObjectAgregarUbicaciones.UbicacionesCliente),
                Click.on(ObjectAgregarUbicaciones.ListaUbicacionesCliente));

    }


}
