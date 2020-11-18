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
        return getInfo() + ";\nKind - " + kind + "\nCountry - " + country.getCountry() + ", " + country.getClimate() + ";";
    }

    public void jumping(int km, int howMany, String where) {
        for (int i = 0; i < howMany; i++) {
            System.out.println("He jumping  to " + where + " " + km + " km!");
        }

    }

    final void jumping(int howMany, String where, int km) {
        for (int i = 0; i < howMany; i++) {
            System.out.println("He jumping to  " + where + " " + km + " km!");
        }

    }

    public void jumping(int howMany, int km) {
        for (int i = 0; i < howMany; i++) {
            System.out.println("He jumping at - " + km + " km!");
        }

    }

    public Kind getKind() {
        return kind;
    }

    public Country getCountry() {
        return country;
    }

}