package com.company;

public class Main {

    public static void main(String[] args) {

        Country country = new Country("Russia", "Hot");
        Reptile objectA = new Reptile(Kind.NOT_POISONOUS, country);
        System.out.println(objectA.getInfo1());
        objectA.jumping(1, 15);
        System.out.println("__________________");

        Country country1 = new Country("Alaska", "cold");
        Frog objectB = new Frog(Kind.POISONOUS, country1, "Aleksey", "Green");
        System.out.println(objectB.getInfo2());
        objectB.jumping(2, "USA", 20);
        System.out.println("__________________");

        Country country2 = new Country("China", "cool");
        Frog objectC = new Frog(country2, Kind.NOT_POISONOUS, "Kim Chen In");
        System.out.println(objectC.getInfo2());
        objectC.jumping("Korea", 3, 50);
        System.out.println("__________________");

        Frog copy = new Frog(objectC);
        objectC.copyMetod(objectB);
        System.out.println(objectC.getInfo2());
        copy.jumping(45, 4, "Japan");

    }
}
