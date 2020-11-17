package com.company;

public class Reptile extends Animal {

    private Kind kind;
    private Country country;

    public Reptile() {

    }

    public Reptile(Kind kind, Country country) {
        this.kind = kind;
        this.country = country;
    }

    public Reptile(Country country, Kind kind) {
        this.country = country;
        this.kind = kind;
    }

    final String getInfo1() {
        return getInfo()+";\nKind - " + kind + "\nCountry - " + country.getCountry() + ", " + country.getClimate() + ";";
    }

    public Kind getKind() {
        return kind;
    }

    public Country getCountry() {
        return country;
    }

}