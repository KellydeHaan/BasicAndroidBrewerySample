package com.kgalligan.basicandroid.shared;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.annotation.Nonnull;

/**
 * Created by kgalligan on 3/27/18.
 */

public class AppPrefs
{
    public static final String FAV_DOG = "FAV_DOG";
    private SharedPreferences prefs;

    public AppPrefs(Application context)
    {
        prefs = context.getSharedPreferences("APP_PREFS", Context.MODE_PRIVATE);
    }

    public Dog getFavoriteDog()
    {
        String fav_dog = prefs.getString(FAV_DOG, null);
        return fav_dog == null ? null : DogFactory.fromJson(fav_dog);
    }

    public void setFavoriteDog(Dog favoriteDog)
    {
        prefs.edit().putString(FAV_DOG, DogFactory.fromDog(favoriteDog)).apply();
    }
}
