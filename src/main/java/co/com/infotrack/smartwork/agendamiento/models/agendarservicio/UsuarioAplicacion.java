package co.com.infotrack.smartwork.agendamiento.models.agendarservicio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioAplicacion {
    private String IdAplicacion;
    private String IdUsuario;

    public UsuarioAplicacion(String idAplicacion, String idUsuario) {
        this.IdAplicacion = idAplicacion;
        this.IdUsuario = idUsuario;
    }

    @Getter
    @Setter
    public static class Solicitud {
        private AgendarServicio Agenda;
        private UsuarioAplicacion UsuarioAplicacion;

        public Solicitud(AgendarServicio agenda, UsuarioAplicacion usuarioAplicacion) {
            this.Agenda = agenda;
            this.UsuarioAplicacion = usuarioAplicacion;
        }
    }

}

