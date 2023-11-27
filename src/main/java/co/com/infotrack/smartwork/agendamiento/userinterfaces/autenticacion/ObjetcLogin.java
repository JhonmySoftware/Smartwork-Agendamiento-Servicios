package co.com.infotrack.smartwork.agendamiento.userinterfaces.autenticacion;

import co.com.infotrack.smartwork.agendamiento.utils.LecturaArchivosProperties;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ObjetcLogin extends PageObject {
    public static Properties properties;

    public static String cargarVersionDelSitio() throws IOException {
        properties = new Properties();
        properties.load(new FileReader("VersionSitio.properties"));
        return properties.getProperty("Version");
    }

    String versionDelSitio = LecturaArchivosProperties.properties.getProperty("");

    public static final Target InputLogin = Target.the("Ingrese su usuario")
            .located(By.xpath("//input[@name='Login']"));
    public static final Target InputPassword = Target.the("Ingrese su contrasenia")
            .located(By.xpath("//input[@name='Contrasenia']"));

    public static final Target ButtonIniciarSesion = Target.the("Iniciar Sesión")
            .located(By.xpath("//span[contains(text(),'Iniciar Sesión')]"));

    public static final Target VersionSitio;

    static {
        try {
            VersionSitio = Target.the("Validar la versión del sitio")
                    .located(By.xpath("//span[contains(text(), '" + cargarVersionDelSitio() + "')]"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
