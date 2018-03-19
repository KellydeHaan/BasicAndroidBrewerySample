package com.kgalligan.basicandroid.shared;
import java.util.UUID;

/**
 * Created by kgalligan on 3/19/18.
 */

public class UUIDMaker
{
    public static String makeUUID()
    {
        return UUID.randomUUID().toString();
    }
}
