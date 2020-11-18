package com.company;

final class Frog extends Reptile {
    private String name;
    private String color;


    public Frog(Kind kind, Country country, String name, String color) {
        super(kind, country);
        this.name = name;
        this.color = color;
    }

    public Frog(Country country, Kind kind, String name) {
        super(country, kind);
        this.name = name;
    }

    public Frog(Frog objectC) {
    }

    public void copyMetod(Frog frog) {
        this.name = frog.getName();
        this.color = frog.getColor();
    }

    public void jumping(int km, int howMany, String where) {
        for (int i = 0; i < howMany; i++) {
            System.out.println("He jumping  to " + where + " " + km + " km!");
        }

    }

    public void jumping(String where, int howMany, int km) {
        for (int i = 0; i < howMany; i++) {
            System.out.println("He jumping to  " + where + " " + km + " km!");
        }

    }

    final String getInfo2() {
        if (color != null) {
            return getInfo1() + "\nName - " + name + ";\nColor - " + color + ";";
        } else {
            return getInfo1() + "\nName - " + name + ";";
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}