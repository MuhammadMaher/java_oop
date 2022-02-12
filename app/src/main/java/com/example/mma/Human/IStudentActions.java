package com.example.mma.Human;

public interface IStudentActions {
// fully abstraction ف مش هعرف اعمل object
    void goTOSchool();

    default void backFromSchool(){

        System.out.println("Back From School AT 2.00 p.m");
    }

    public static final int x=53;

}
