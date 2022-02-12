package com.example.mma.Human;
public class Student extends Human implements IStudentActions{
    private String Id;
    public Student(String name, int age, double weight, double height, String id) {
        super(name, age, weight, height);
        Id = id;


    }

//    @Override
//    public void wakeUP() {
//        super.printInformation();
//        System.out.println("WakeUp At :"+ WakeUP);
//    }

    // التحكم في ال
    // التعديل في الوراثة باستخدام override
    // التعديل عشان لما اجي اطبع يزود id
    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Id :" + Id);
    }
    @Override
    public void nationality() {
        System.out.println("nationality : Arabian");
        backFromSchool();
    }

    @Override
    public void goTOSchool() {
        System.out.println("he goes to school at 8.00 a.m");
    }


// جيت عملت هنا override عشان كلاس human  معرف ك abstract
    @Override
    public void breakfast() {
        System.out.println("Breakfast at 7 o'clock");

    }

    @Override
    public void lunch() {
        System.out.println(" lunch at 1 o'clock");

    }

    @Override
    public void dinner() {
        System.out.println("dinner at 8 o'clock");

    }
}
