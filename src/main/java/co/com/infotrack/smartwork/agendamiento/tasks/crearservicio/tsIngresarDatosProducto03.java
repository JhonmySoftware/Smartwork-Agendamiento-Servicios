package co.com.infotrack.smartwork.agendamiento.tasks.crearservicio;

import co.com.infotrack.smartwork.agendamiento.interactions.autenticacion.isCerrarSesion;
import co.com.infotrack.smartwork.agendamiento.models.OrdenDeServicio;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio.ObjectCrearServicio;
import co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio.ObjectDatosProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class tsIngresarDatosProducto03 implements Task {

    private final OrdenDeServicio ordenDeServicio;

    public tsIngresarDatosProducto03(OrdenDeServicio ordenDeServicio) {
        this.ordenDeServicio = ordenDeServicio;
    }

    public final static tsIngresarDatosProducto03 conEstosDatos3(OrdenDeServicio ordenDeServicio) {
        return new tsIngresarDatosProducto03(ordenDeServicio);
    }


    // Ingresar los datos del producto
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ordenDeServicio.getSerial()).into(ObjectDatosProducto.Serial),
                Click.on(ObjectDatosProducto.ListaSerial),
                Enter.theValue(ordenDeServicio.getFalla()).into(ObjectDatosProducto.Falla),
                Click.on(ObjectDatosProducto.ListaFalla),
                Click.on(ObjectDatosProducto.GuardarServicio),
                Click.on(ObjectCrearServicio.Continuar)
        );

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Cerrar Sesión
        actor.attemptsTo(isCerrarSesion.one());
    }

}
