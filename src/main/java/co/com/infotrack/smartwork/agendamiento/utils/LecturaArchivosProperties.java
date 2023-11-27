package co.com.infotrack.smartwork.agendamiento.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LecturaArchivosProperties {

    public static Properties properties;

    public static void Credenciales() throws IOException {
        properties = new Properties();
        properties.load(new FileReader("Login.properties"));
    }

    public static void VersionSitio() throws  IOException{
        properties = new Properties();
        properties.load(new FileReader("VersionSitio.properties"));
    }

}
