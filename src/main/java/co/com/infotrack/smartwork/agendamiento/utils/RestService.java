package co.com.infotrack.smartwork.agendamiento.utils;

public enum RestService {
    BASE_URL("https://work.infotracktest.com"), AGENDAR_SERVICIOS("/Servicios/api/Agenda/GuardarAgenda");
    private String uri;

    RestService(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }
}
