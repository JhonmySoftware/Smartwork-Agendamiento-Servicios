package co.com.infotrack.smartwork.agendamiento.tasks;

import co.com.infotrack.smartwork.agendamiento.interactions.isAbrirPagina;
import co.com.infotrack.smartwork.agendamiento.interactions.isLogin;
import co.com.infotrack.smartwork.agendamiento.models.OrdenDeServicio;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.ObjectCrearServicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

public class tsCrearServicio01 implements Task {

    public static tsCrearServicio01 one() {
        return Tasks.instrumented(tsCrearServicio01.class);
    }
    private final OrdenDeServicio ordenDeServicio;

    public tsCrearServicio01(OrdenDeServicio ordenDeServicio) {
        this.ordenDeServicio = ordenDeServicio;
    }
    public static tsCrearServicio01 conEstosDatos(OrdenDeServicio ordenDeServicio) {
        return Tasks.instrumented(tsCrearServicio01.class, ordenDeServicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Abrir pagina
        actor.attemptsTo(isAbrirPagina.one());

        // Logueo en el sitio web
        actor.attemptsTo(isLogin.one());

        // Proceso de creación del servicio
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(ObjectCrearServicio.Smartwork),
                        WebElementStateMatchers.isVisible()).forNoLongerThan(30).seconds(),
                Click.on(ObjectCrearServicio.Smartwork),
                Click.on(ObjectCrearServicio.GestionServicios),
                Wait.until(WebElementQuestion.the(ObjectCrearServicio.CrearServicio),
                        WebElementStateMatchers.isVisible()).forNoLongerThan(60).seconds(),
                Click.on(ObjectCrearServicio.CrearServicio)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Ingresa la información de tipo de identificación e identificación
        actor.attemptsTo(
                Click.on(ObjectCrearServicio.TipoIdentificacion),
                Click.on(ObjectCrearServicio.CedulaCiudadania),
                Enter.theValue(ordenDeServicio.getIdentificacion())
                        .into(ObjectCrearServicio.Identificacion),
                Click.on(ObjectCrearServicio.BuscarCliente),
                Click.on(ObjectCrearServicio.Continuar),
                Enter.theValue(ordenDeServicio.getCodigoCliente()).into(ObjectCrearServicio.CodigoCliente),
                Enter.theValue(ordenDeServicio.getNombre()).into(ObjectCrearServicio.Nombre),
                Enter.theValue(ordenDeServicio.getCorreoElectronico()).into(ObjectCrearServicio.CorreoElectronico),
                Enter.theValue(ordenDeServicio.getCelular()).into(ObjectCrearServicio.Celular),
                Click.on(ObjectCrearServicio.CheckNotificacionCorreo),
                Click.on(ObjectCrearServicio.CheckNotificacionMensaje)
        );

        // Diligenciar el formulario del clicnte
    }
}
