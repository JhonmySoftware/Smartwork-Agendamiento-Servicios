package co.com.infotrack.smartwork.agendamiento.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Credenciales {

    public static Properties properties;

    public static void Credenciales() throws IOException {
        properties = new Properties();
        properties.load(new FileReader("Login.properties"));
    }

}
