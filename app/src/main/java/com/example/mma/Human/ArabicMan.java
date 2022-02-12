package com.example.mma.Human;

public class ArabicMan extends Human {
   private String Language;
    public ArabicMan(String name, int age, double weight, double height, String language) {
        super(name, age, weight, height);
        this.Language = language;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Language :"+Language);
    }

    @Override
    public  void nationality() {
        System.out.println("nation : Algeria");
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


