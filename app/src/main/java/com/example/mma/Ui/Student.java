package com.example.mma.Ui;

public class Student {

    private int counter=0;
    public static String branch="CS";
    private final String name;
    //private final String id;
    private final int id;


//    public Student (String name,String id){
//        this.name=name;
//        this.id=id;
//        counter++;
//        System.out.println(counter);
//
//    }

    public Student (String name,int id){
        this.name=name;
        this.id=id;
        counter++;
        System.out.println(counter);
   }
//    public Student (int id,String name){
//        this.name=name;
//        this.id=id;
//        counter++;
//        System.out.println(counter);
//
//    }
    public void printInfo(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Branch :"+branch);
    }


    // OverLoading
    // هتحتلف في نوعهم وترتيهم وعددهم اللي هم parameters
    // نفس الكلام بالنسبة لل constructor
    void test(){

    }
    void test(int x){

    } void test(float y){

    }
  //  void test(int x,float y){}

    void test(float x,float y){
    }
    void test(int y, float x){

    }

    void test(float x, int y) {


    }
}