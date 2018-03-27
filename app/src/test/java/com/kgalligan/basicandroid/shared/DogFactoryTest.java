package com.kgalligan.basicandroid.shared;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by kgalligan on 3/21/18.
 */
public class DogFactoryTest
{
    @Test
    public void fromDog() throws Exception
    {
        Dog dog = new Dog();
        dog.setAge(24);
        dog.setName("Fido");
        dog.setLikesBellies(true);
        String dogJson = DogFactory.fromDog(dog);
        Assert.assertTrue(dogJson.contains("Fido"));
    }

    @Test
    public void fromJson() throws Exception
    {
    }

}