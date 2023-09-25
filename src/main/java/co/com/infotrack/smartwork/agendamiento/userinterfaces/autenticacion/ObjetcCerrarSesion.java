package co.com.infotrack.smartwork.agendamiento.userinterfaces.autenticacion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjetcCerrarSesion extends PageObject {

    public static final Target Perfil = Target.the("icono para ver el perfil de cierre de la sesión")
            .located(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-colorDisabled'])[1]"));
    public static final Target CerrarSesion = Target.the("Modulo para realizar el cierre de la sesión")
            .located(By.xpath("(//span[normalize-space()='Cerrar Sesión'])[1]"));

}
