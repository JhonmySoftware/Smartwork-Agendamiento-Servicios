package co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjectDatosProducto extends PageObject {

    public static Target Serial = Target.the("Campo de Serial")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hora Inicio'])[2]"));
    public static Target Productos = Target.the("Campo de Productos")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Productos'])[1]"));
    public static Target Fallas = Target.the("Campo de Fallas")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Fallas'])[1]"));

    public static Target Guardar = Target.the("Guardar Servicio")
            .located(By.xpath("//span[contains(text(),'Guardar')]"));

}
