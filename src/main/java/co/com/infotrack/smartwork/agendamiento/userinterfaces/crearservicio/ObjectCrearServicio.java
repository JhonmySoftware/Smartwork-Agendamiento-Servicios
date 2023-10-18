package co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class ObjectCrearServicio extends PageObject {


    /**
     * Ingresar al módulo principal e ir al formulario de creación de la orden de servicio
     * */

    public static Target Smartwork = Target.the("Modulo principal de Smartwork")
            .located(By.xpath("//span[contains(text(),'Smart Work')]"));
    public static Target GestionServicios = Target.the("Sub-Modulo principal de Gestión de servicios")
            .located(By.xpath("//h6[normalize-space()='Gestión Servicios']"));
    public static Target CrearServicio = Target.the("Botón +  de crear el servicio")
            .located(By.xpath("(//*[name()='svg'][@title='Crear Servicio'])[1]"));

    /**
     * Diligenciar el formulario para la creación del cliente
     * */

    public static Target TipoIdentificacion = Target.the("Campo Tipo de Identificación")
            .located(By.id("-IdTipoIdentificacion"));

    public static Target CedulaCiudadania = Target.the("Lista cedula de ciudadania")
            .located(By.xpath("//li[normalize-space()='Cédula de ciudadanía']"));

    public static Target NIT = Target.the("Lista NIT")
            .located(By.xpath("//li[normalize-space()='NIT']"));

    public static Target CedulaExtranjeria = Target.the("Lista Cedula de extrajeria")
            .located(By.xpath("//li[normalize-space()='Cédula de extranjería']"));

    public static Target Identificacion = Target.the("Campo Identificación")
            .located(By.name("Identificacion"));

    public static Target BuscarCliente = Target.the("Campo de buscar el cliente")
            .located(By.id("Boton-consultarCliente"));


    public static Target Continuar = Target.the("Alerta para continuar con la creación del cliente")
            .located(By.xpath("//span[contains(text(),'Continuar')]"));

    public static Target CodigoCliente = Target.the("Campo Código de Cliente")
            .located(By.name("CodigoCliente"));

    public static Target Nombre = Target.the("Campo Nombre")
            .located(By.name("Nombre"));

    public static Target CorreoElectronico = Target.the("Campo Correo Electrónico")
            .located(By.name("CorreoElectronico"));

    public static Target Celular = Target.the("Campo Celular")
            .located(By.name("Celular"));

    public static Target CheckNotificacionCorreo = Target.the("Campo Check Notificacion Correo")
            .located(By.xpath("(//input[@type='checkbox'])[3]"));

    public static Target CheckNotificacionMensaje = Target.the("Campo Check Notificacion Mensaje")
            .located(By.xpath("(//input[@type='checkbox'])[4]"));

    public static Target Guardar = Target.the("Guardar datos del cliente")
            .located(By.xpath("//span[contains(text(),'Guardar')]"));

    public static Target OrdenServicioCreado = Target.the("campo para obtener el numero de la orden de servicio creada")
            .located(By.xpath("//td[2]"));

}
