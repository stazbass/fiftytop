package com.stzbzz.top50.steps;

import com.google.gson.GsonBuilder;

public class JsonSerializer {
    public static <T> String serialize(T object){
        return new GsonBuilder().setPrettyPrinting().create().toJson(object);
    }
}
