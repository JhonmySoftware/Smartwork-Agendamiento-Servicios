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

    public static Target AgregarUbicaciones = Target.the("Agregar Ubicaciones del cliente")
            .located(By.xpath("//button[@title='Agregar']"));

    public static Target CheckMismosDatosPrincipal = Target.the("Check en el campo mismos datos del principal")
            .located(By.xpath("(//input[@type='checkbox'])[5]"));

    public static Target Direccion = Target.the("Campo de Dirección")
            .located(By.name("Direccion"));

    public static Target ComplementoDireccion = Target.the("Complemento de dirección")
            .located(By.name("Lugar"));

    public static Target Latitud = Target.the("Latitud")
            .located(By.name("Latitud"));

    public static Target Longitud = Target.the("Latitud")
            .located(By.name("Longitud"));

    public static Target GuardarUbicacion = Target.the("Guardar Ubicacion ")
            .located(By.name("Longitud"));


    public static Target CodigoServicio = Target.the("Campo Código de Servicio")
            .located(By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing']//span[@class='MuiTypography-root MuiTypography-colorInherit'][normalize-space()='Guardar']"));


    /**
     * Diligenciar el formulario para la creación del servicio
     * */
    public static Target ClaseServicio = Target.the("Campo Clase de Servicio")
            .located(By.id("claseServicioId"));

    public static Target TipoServicio = Target.the("Campo Tipo de Servicio")
            .located(By.id("tipoServicioId"));

    public static Target Prioridad = Target.the("Campo Prioridad")
            .located(By.id("prioridadId"));

    public static Target HoraInicio = Target.the("Campo Hora de Inicio")
            .located(By.id("horaInicioId"));

    public static Target HoraFin = Target.the("Campo Hora de Fin")
            .located(By.id("horaFinId"));

    public static Target Zonas = Target.the("Campo Zonas")
            .located(By.id("zonasId"));

    public static Target Observacion = Target.the("Campo Observación")
            .located(By.id("observacionId"));

    public static Target Serial = Target.the("Campo Serial")
            .located(By.id("serialId"));

    public static Target Productos = Target.the("Campo Productos")
            .located(By.id("productosId"));

    public static Target Falla = Target.the("Campo Falla")
            .located(By.id("fallaId"));



}
