package com.company;

public class Animal {
    private int age = generateDefaultAge();

    private int generateDefaultAge() {
        return (int) (Math.random() * 10 + 5);
    }

    final String getInfo() {
        return "Age - " + age;
    }

    public int getAge() {
        return age;
    }

}
