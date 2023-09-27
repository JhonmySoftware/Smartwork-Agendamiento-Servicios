package co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ObjectDatosServicio extends PageObject {

    public static Target codigoServicio = Target.the("Código Servicio").located(By.id("codigoServicio"));
    public static Target ClaseServicio = Target.the("Clase Servicio").located(By.id("ClaseServicio"));
    public static Target IdTipoServicio = Target.the("Tipo Servicio").located(By.id("IdTipoServicio"));
    public static Target Prioridad = Target.the("Selecscionar Prioridad del  Servicio")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese su usuario'])"));
    public static Target HoraInicio = Target.the("Hora de Inicio")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hora Inicio'])[2]"));
    public static Target HoraFin = Target.the("Hora de fin")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hora Fin'])[2]"));
    public static Target Zonas = Target.the("Zonas")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Zonas'])[1]/following::input[1]"));
    public static Target Observacion = Target.the("Observación")
            .located(By.id("Observacion-"));

}