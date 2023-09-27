package co.com.infotrack.smartwork.agendamiento.interactions.crearservicio;

import co.com.infotrack.smartwork.agendamiento.models.OrdenDeServicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class IngresarDatosServicio implements Interaction {


    private final OrdenDeServicio ordenDeServicio;

    public IngresarDatosServicio(OrdenDeServicio ordenDeServicio) {
        this.ordenDeServicio = ordenDeServicio;
    }

    public final IngresarDatosServicio ConEstosdatos(OrdenDeServicio ordenDeServicio) {
        return new IngresarDatosServicio(ordenDeServicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }
}
