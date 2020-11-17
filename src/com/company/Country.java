package com.company;

public class Country {

    private String country;
    private String climate;

    public String getCountry() {
        return country;
    }

    public String getClimate() {
        return climate;
    }

    public Country(String country, String climate) {
        this.country = country;
        this.climate = climate;
    }
}