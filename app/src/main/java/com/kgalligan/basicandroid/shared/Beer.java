package com.kgalligan.basicandroid.shared;

public class Beer {

    private String name;
    private String brewery;
    private String keg;
    private String style;
    private float alcohol;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public String getKeg() {
        return keg;
    }

    public void setKeg(String keg) {
        this.keg = keg;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", brewery='" + brewery + '\'' +
                ", keg='" + keg + '\'' +
                ", style='" + style + '\'' +
                ", alcohol=" + alcohol +
                ", volume=" + volume +
                '}';
    }
}
