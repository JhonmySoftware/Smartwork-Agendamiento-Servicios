package co.com.infotrack.smartwork.agendamiento.utils;

import com.google.gson.Gson;

public class JsonUtil {

    private static final Gson gson = new Gson();

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }
}

