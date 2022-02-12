package com.example.mma.Human;

public class EnglishMan extends Human {
    private String Language;
    public EnglishMan(String name, int age, double weight, double height, String language) {
        super(name, age, weight, height);

        Language = language;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Language :"+ Language);
    }
    @Override
    public void nationality() {
        System.out.println("nation : UK");
    }

    @Override
    public void breakfast() {

    }

    @Override
    public void lunch() {

    }

    @Override
    public void dinner() {

    }
}

