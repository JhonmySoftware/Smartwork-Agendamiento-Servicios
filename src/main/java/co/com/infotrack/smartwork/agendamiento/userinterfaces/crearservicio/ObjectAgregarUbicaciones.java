package co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjectAgregarUbicaciones extends PageObject {

    public static final Target AgregarDireccion = Target.the("Boto + de agregar ubicaciones")
            .located(By.xpath("//button[@title='Agregar']"));

    public static final Target Mismosdatosprincipal = Target.the("COnfirmar los mismo datos del usuario registrado")
            .located(By.xpath("(//input[@type='checkbox'])[5]"));

    public static final Target Direccion = Target.the("btón de Ubicación del cliente")
            .located(By.name("Direccion"));

    public static final Target Complemento = Target.the("btón de complemento del cliente")
            .located(By.name("Lugar"));

    public static final Target Departamento = Target.the("Departamento")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Departamento'])[1]/following::input[1]"));

    public static final Target ListaDepartamento = Target.the("Lista Departamento")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Departamento'])[1]/following::li[1]"));

    public static final Target Ciudad = Target.the("Ciudad")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad'])[1]/following::input[1]"));

    public static final Target ListaCiudad = Target.the("Lista Ciudad")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad'])[1]/following::li[1]"));




    public static final Target GuardarDireccion = Target.the("btón de Guardar direccion del cliente")
            .located(By.xpath("(//span[@class='MuiTypography-root MuiTypography-colorInherit'][normalize-space()='Guardar'])[2]"));

    public static final Target ContinuarDireccion = Target.the("btón de Continuar con la  direccion del cliente")
            .located(By.xpath("//span[contains(text(),'Continuar')]"));

    public static final Target VolverForumlarioServicio = Target.the("btón de Volver al formulario del servicio con la  direccion del cliente")
            .located(By.xpath("//span[contains(text(),'Volver')]"));

    public static final Target UbicacionesCliente = Target.the("Ubicaciones del cliente despues de haber agregado la dirección")
            .located(By.id("ubicacion-"));

    public static final Target ListaUbicacionesCliente = Target.the("Lista Ubicaciones del cliente despues de haber agregado la dirección")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ubicaciones Cliente'])[1]/following::li[1]"));


}
