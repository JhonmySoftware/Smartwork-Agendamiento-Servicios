package co.com.infotrack.smartwork.agendamiento.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfiguracionToken {

    public static Properties properties;

    public static void ConfiguracionToken() throws IOException {
        properties = new Properties();
        properties.load(new FileReader("token.properties"));
    }

}