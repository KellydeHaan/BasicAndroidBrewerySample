package com.kgalligan.basicandroid.shared;

import java.util.List;

public class Brewery {

    private String name;

    private String address;
    private String city;
    private List<String> open;
    private String zipcode;

    private List<Beer> beers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getOpen() {
        return open;
    }

    public void setOpen(List<String> open) {
        this.open = open;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<Beer> getBeers() {
        return beers;
    }

    public void setBeers(List<Beer> beers) {
        this.beers = beers;
    }

    @Override
    public String toString() {
        return "Brewery{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", open=" + open +
                ", zipcode='" + zipcode + '\'' +
                ", beers=" + beers +
                '}';
    }
}
