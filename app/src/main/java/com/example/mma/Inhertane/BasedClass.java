package com.example.mma.Inhertane;

public class BasedClass {
    //superClass هو اللي انا وارث منه

    // ماحدش هيغيرها حالص  في اخليها final
    public final boolean isNetworkConnected(){
        return true;

    }
     void startLoading(){

        System.out.println("Loading Start");
    }
    void stopLoading(){
        System.out.println("Loading Finished");

    }
    // لو الكلاس نفسة final ماحدش يعرف يعمل inheritance
    //  لو جمب function ينفع يستخدمها لكن مايعرفش يعدل عليها
    // protected في الوراثة ااقدر اشوف داخل وخارج البكدج
}
