package com.kingOf0.fatura.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Utils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public static String encodeURIComponent(String s) throws UnsupportedEncodingException {
        return URLEncoder.encode(s, "UTF-8")
                .replaceAll("\\+", "%20")
                .replaceAll("%21", "!")
                .replaceAll("%27", "'")
                .replaceAll("%28", "(")
                .replaceAll("%29", ")")
                .replaceAll("%7E", "~");
    }

    static List<Method> getPublicMethods(Object o) {
        List<Method> publicMethods = new ArrayList<>();

        // getDeclaredMethods only includes methods in the class (good)
        // but also includes protected and private methods (bad)
        for (Method method : o.getClass().getDeclaredMethods()) {
            if (!Modifier.isPublic(method.getModifiers())) continue; //only **public** methods
            if (!Modifier.isStatic(method.getModifiers())) continue; //only public **methods**
            publicMethods.add(method);
        }
        return publicMethods;
    }

    public static <T> String encode(T object) throws JsonProcessingException, UnsupportedEncodingException {
        String s = objectMapper.writeValueAsString(object);
        System.out.println("Encoded: " + s);
        return Utils.encodeURIComponent(s);
    }


}
