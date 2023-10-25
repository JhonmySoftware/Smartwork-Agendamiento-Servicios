package co.com.infotrack.smartwork.agendamiento.models.agendarservicio;


import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class AgendarServicio {

    private long  Id;
    private long  IdServicio;
    private long  IdZona;
    private long  IdCuadrilla;
    private long  IdEstado;
    private String FechaInicio;
    private String FechaFin;
}
