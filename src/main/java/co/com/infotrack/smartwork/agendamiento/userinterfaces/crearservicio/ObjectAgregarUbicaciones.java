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

    public static final Target GuardarDireccion = Target.the("btón de Guardar direccion del cliente")
            .located(By.xpath("(//span[@class='MuiTypography-root MuiTypography-colorInherit'][normalize-space()='Guardar'])[2]"));

    public static final Target ContinuarDireccion = Target.the("btón de Continuar con la  direccion del cliente")
            .located(By.xpath("//span[contains(text(),'Continuar')]"));

    public static final Target VolverForumlarioServicio = Target.the("btón de Volver al formulario del servicio con la  direccion del cliente")
            .located(By.xpath("//span[contains(text(),'Volver')]"));
}
