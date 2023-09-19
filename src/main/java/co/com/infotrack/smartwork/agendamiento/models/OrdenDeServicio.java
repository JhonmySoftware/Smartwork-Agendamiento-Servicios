package co.com.infotrack.smartwork.agendamiento.models;


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

}
