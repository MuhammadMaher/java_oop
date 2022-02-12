package com.example.mma.AbstractPackage;

public class CClass extends BClass {
    // B التي ورثها من الكلاس abstract لجميع الدوال التي نوعها Override يجب أن يفعل C الكلاس

    @Override
    public void print2() {
        System.out.println("Class C should override the method print1()");

    }

    @Override
    public void print1() {
        System.out.println("Class C should override the method print2()");

    }
}
