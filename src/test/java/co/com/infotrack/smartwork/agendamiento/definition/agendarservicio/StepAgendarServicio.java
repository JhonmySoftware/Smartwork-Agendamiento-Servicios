package co.com.infotrack.smartwork.agendamiento.definition.agendarservicio;

import co.com.infotrack.smartwork.agendamiento.models.agendarservicio.AgendarServicio;
import co.com.infotrack.smartwork.agendamiento.tasks.agendarservicio.tsAgendarServicio;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

public class StepAgendarServicio {
    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
        System.setProperty("webdriver.edge.driver", "src/test/resources/driver/msedgedriver.exe");
    }

    Actor actor = Actor.named("Automatizador");


    @Dado("^que el usuario tiene acceso al servicio de agendamiento$")
    public void queElUsuarioTieneAccesoAlServicioDeAgendamiento() {
    }

    @Cuando("^el usuario realiza una solicitud de agendamiento con los siguientes datos$")
    public void elUsuarioRealizaUnaSolicitudDeAgendamientoConLosSiguientesDatos(DataTable datos) {
        List<Map<String, String>> data = datos.asMaps(String.class, String.class);
        AgendarServicio agendarServicio = new AgendarServicio();
        agendarServicio.setId(Long.parseLong(data.get(0).get("Id")));
        agendarServicio.setIdServicio(Long.parseLong(data.get(0).get("IdServicio")));
        agendarServicio.setIdZona(Long.parseLong(data.get(0).get("IdZona")));
        agendarServicio.setIdCuadrilla(Long.parseLong(data.get(0).get("IdCuadrilla")));
        agendarServicio.setIdEstado(Long.parseLong(data.get(0).get("IdEstado")));
        agendarServicio.setFechaInicio(data.get(0).get("FechaInicio"));
        agendarServicio.setFechaFin(data.get(0).get("FechaFin"));

        OnStage.theActorCalled(actor.getName()).wasAbleTo(tsAgendarServicio.conEstosDatos(agendarServicio));
    }


    @Entonces("^la orden de servicio debe ser agendada correctamente$")
    public void laOrdenDeServicioDebeSerAgendadaCorrectamente() {
    }


}
