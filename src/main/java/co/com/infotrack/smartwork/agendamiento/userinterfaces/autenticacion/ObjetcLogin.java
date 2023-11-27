package co.com.infotrack.smartwork.agendamiento.userinterfaces.autenticacion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ObjetcLogin extends PageObject {

    public static final Target InputLogin = Target.the("Ingrese su usuario")
            .located(By.xpath("//input[@name='Login']"));
    public static final Target InputPassword = Target.the("Ingrese su contrasenia")
            .located(By.xpath("//input[@name='Contrasenia']"));

    public static final Target ButtonIniciarSesion = Target.the("Iniciar Sesión")
            .located(By.xpath("//span[contains(text(),'Iniciar Sesión')]"));

    public static final Target VersionSitio = Target.the("Validar la versión del sitio")
            .located(By.xpath("//span[contains(text(), '1.6.3')]"));

}
