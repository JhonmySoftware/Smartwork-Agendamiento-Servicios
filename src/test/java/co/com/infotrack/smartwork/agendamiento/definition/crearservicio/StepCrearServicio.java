package co.com.infotrack.smartwork.agendamiento.definition.crearservicio;

import co.com.infotrack.smartwork.agendamiento.interactions.autenticacion.isCerrarSesion;
import co.com.infotrack.smartwork.agendamiento.models.crearservicio.CedulaRandom;
import co.com.infotrack.smartwork.agendamiento.models.crearservicio.OrdenDeServicio;
import co.com.infotrack.smartwork.agendamiento.questions.crearservicio.QsCrearServicio;
import co.com.infotrack.smartwork.agendamiento.tasks.crearservicio.tsCrearServicio01;
import co.com.infotrack.smartwork.agendamiento.tasks.crearservicio.tsIngresarDatosProducto03;
import co.com.infotrack.smartwork.agendamiento.tasks.crearservicio.tsIngresarDatosServicio02;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.ast.Y;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class StepCrearServicio {
    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
        System.setProperty("webdriver.edge.driver", "src/test/resources/driver/msedgedriver.exe");
    }

    isCerrarSesion IsCerrarSesion;

    // Crea una nueva orden de servicio y asigna los datos
    OrdenDeServicio ordenDeServicio = new OrdenDeServicio();
    Actor actor = Actor.named("Automatizador");

    @Dado("^que en el call center se desea crear una orden de servicio con los siguientes datos$")
    public void queEnElCallCenterSeDeseaCrearUnaOrdenDeServicioConLosSiguientesDatos(DataTable datos) {
        List<Map<String, String>> data = datos.asMaps(String.class, String.class);
        OrdenDeServicio ordenDeServicio = new OrdenDeServicio();
        CedulaRandom cedulaRandom = new CedulaRandom();
        ordenDeServicio.setTipoIdentificacion(data.get(0).get("Tipo Identificacion"));
        ordenDeServicio.setIdentificacion(CedulaRandom.numaleatorio());
        ordenDeServicio.setCodigoCliente(data.get(0).get("Codigo cliente"));
        ordenDeServicio.setNombre(data.get(0).get("Nombre"));
        ordenDeServicio.setCorreoElectronico(data.get(0).get("Correo electronico"));
        ordenDeServicio.setCelular(data.get(0).get("Celular"));
        ordenDeServicio.setUbicacion(data.get(0).get("Ubicacion"));
        ordenDeServicio.setComplemento(data.get(0).get("Complemento"));
        ordenDeServicio.setCiudad(data.get(0).get("Ciudad"));
        ordenDeServicio.setDepartamento(data.get(0).get("Departamento"));

        // Pasar los datos a la tarea tsCrearServicio01
        OnStage.theActorCalled(actor.getName())
                .wasAbleTo(tsCrearServicio01.conEstosDatos(ordenDeServicio));
    }

    @Y("^se ingresan los siguientes datos del servicio$")
    public void seIngresanLosSiguientesDatosDelServicio(DataTable datos) {
        List<java.util.Map<String, String>> data = datos.asMaps(String.class, String.class);
        ordenDeServicio.setCodigoServicio(data.get(0).get("Codigo del servicio"));
        ordenDeServicio.setClaseServicio(data.get(0).get("Clase servicio"));
        ordenDeServicio.setTipoServicio(data.get(0).get("Tipo Servicio"));
        ordenDeServicio.setPrioridad(data.get(0).get("Prioridad"));
        ordenDeServicio.setHoraInicio(data.get(0).get("Hora inicio"));
        ordenDeServicio.setHoraFin(data.get(0).get("Hora fin"));
        ordenDeServicio.setZonas(data.get(0).get("Zonas"));
        ordenDeServicio.setObservacion(data.get(0).get("Observacion"));

        // Pasar los datos a la tarea tsIngresarDatosServicio
        OnStage.theActorCalled(actor.getName())
                .wasAbleTo(tsIngresarDatosServicio02.conEstosDatos2(ordenDeServicio));
    }

    @Y("^se ingresan los siguientes datos del producto$")
    public void seIngresanLosSiguientesDatosDelProducto(DataTable datos) {
        List<Map<String, String>> data = datos.asMaps(String.class, String.class);
        ordenDeServicio.setSerial(data.get(0).get("Serial"));
        ordenDeServicio.setProductos(data.get(0).get("Productos"));
        ordenDeServicio.setFalla(data.get(0).get("Falla"));

        // Pasar los datos a la tarea tsIngresarDatosProducto
        OnStage.theActorCalled(actor.getName())
                .wasAbleTo(tsIngresarDatosProducto03.conEstosDatos3(ordenDeServicio));
    }

    @Cuando("^se crea la orden de servicio$")
    public void seCreaLaOrdenDeServicio() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(QsCrearServicio.one(),
                Matchers.comparesEqualTo(ordenDeServicio.getNumeroOrdenServicio())));
    }

    @Entonces("^se verifica que la orden de servicio se ha creado correctamente$")
    public void seVerificaQueLaOrdenDeServicioSeHaCreadoCorrectamente() {
        // Aquí puedes implementar la lógica para verificar que la orden de servicio se ha creado correctamente
        OnStage.theActorCalled(actor.getName()).wasAbleTo(isCerrarSesion.one());
    }


}
