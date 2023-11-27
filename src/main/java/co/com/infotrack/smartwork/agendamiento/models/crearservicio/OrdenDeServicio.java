package co.com.infotrack.smartwork.agendamiento.models.crearservicio;


import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class OrdenDeServicio {

    private String tipoIdentificacion;
    private String identificacion;
    private String codigoCliente;
    private String nombre;
    private String correoElectronico;
    private String celular;
    private String codigoServicio;
    private String claseServicio;
    private String tipoServicio;
    private String prioridad;
    private String horaInicio;
    private String horaFin;
    private String zonas;
    private String observacion;
    private String serial;
    private String productos;
    private String falla;
    private String Ubicacion;
    private String Complemento;
    private String Ciudad;
    private String Departamento;

    private String Dv;

    // variable donde guardaré la orden de servicio creada
    private String NumeroOrdenServicio;

}
