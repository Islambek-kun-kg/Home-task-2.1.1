package com.company;

public class Main {

    public static void main(String[] args) {

        Country country = new Country("Russia", "Hot");
        Reptile objectA = new Reptile(Kind.NOT_POISONOUS, country);
        System.out.println(objectA.getInfo1());
        System.out.println("__________________");

        Country country1 = new Country("Alaska", "cold");
        Frog objectB = new Frog(Kind.POISONOUS, country1, "Aleksey", "Green");
        System.out.println(objectB.getInfo2());
        System.out.println("__________________");

        Country country2 = new Country("China", "cool");
        Frog objectC = new Frog(country2, Kind.NOT_POISONOUS, "Kim Chen In");
        System.out.println(objectC.getInfo2());
        System.out.println("__________________");

        Frog copy = new Frog(objectC);
        objectC.copyMetod(objectB);
        System.out.println(objectC.getInfo2());

    }
}
