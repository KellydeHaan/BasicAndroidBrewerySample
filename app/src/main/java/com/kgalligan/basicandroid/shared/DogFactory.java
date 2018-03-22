package com.kgalligan.basicandroid.shared;
import com.google.gson.Gson;

import javax.annotation.Nonnull;

/**
 * Created by kgalligan on 3/21/18.
 */

public class DogFactory
{
    @Nonnull
    public static String fromDog(Dog dog)
    {
        Gson gson = new Gson();
        String dogJson = gson.toJson(dog);
        return dogJson;
    }

    @Nonnull
    public static Dog fromJson(String json)
    {
        Gson gson = new Gson();
        Dog dog = gson.fromJson(json, Dog.class);
        return dog;
    }
}
