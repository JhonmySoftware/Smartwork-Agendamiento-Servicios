package co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class ObjectDatosProducto extends PageObject {

    public static Target Serial = Target.the("Campo Serial")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Serial'])[1]/following::input[1]"));

    public static Target ListaSerial = Target.the("Lista Campo Serial")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Serial'])[1]/following::li[1]"));

    public static Target Productos = Target.the("Campo Productos")
            .located(net.thucydides.core.annotations.findby.By.id("productosId"));

    public static Target Falla = Target.the("Campo Falla")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Fallas'])[1]/following::input[1]"));

    public static Target ListaFalla = Target.the("Lista Campo Falla")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Fallas'])[1]/following::li[1]"));

    public static Target GuardarServicio = Target.the("Botón para guardar el servicio")
            .located(By.xpath("//span[contains(text(),'Guardar')]"));



}
