package com.example.mma.Human;

public class SpanishMan extends Human {
    private String language;
    public SpanishMan(String name, int age, double weight, double height, String language) {
        super(name, age, weight, height);
        this.language = language;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Language :"+language);
    }

    @Override
    public void nationality() {
        System.out.println("nation : Spanish");
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
