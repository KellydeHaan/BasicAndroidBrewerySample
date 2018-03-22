package com.kgalligan.basicandroid.shared;
/**
 * Created by kgalligan on 3/21/18.
 */

public class Dog
{
    private String name;
    private int age; //In months
    private boolean likesBellies;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isLikesBellies()
    {
        return likesBellies;
    }

    public void setLikesBellies(boolean likesBellies)
    {
        this.likesBellies = likesBellies;
    }
}
