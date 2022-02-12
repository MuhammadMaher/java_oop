package com.example.mma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mma.Human.IHumanNature;
import com.example.mma.Ui.SignActivity;
import com.example.mma.Ui.RegesterActivity;

public class MainActivity extends AppCompatActivity {

    // Enum

  //void updateDays(Days days){ System.out.println(days); }
    TextView textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewEmail = findViewById(R.id.main_activity_tv_email);
        String email = getIntent().getStringExtra("email");
        textViewEmail.setText(email);



// Anonymous class
    IHumanNature student=new IHumanNature() {
        @Override
        public void breakfast() {
            System.out.println("BreakFast AT 7 am");

        }

        @Override
        public void lunch() {
            System.out.println("lunch AT 2 pm");
        }

        @Override
        public void dinner() {
            System.out.println("dinnerAT 8 pm");

        }
    };
    student.breakfast();

//// وصول مباشر للثوابت الموجودة بالEnum
//        System.out.println(Days.MONDAY);
//        System.out.println(Days.THURSDAY.ordinal());
//
// //       updateDays(Days.sunday);
//
//
////عرض جميع الثوابت الموجودة في الـ enum بالإعتماد على الدالة values() و الحلقة for each
//        for (Days I:Days.values()){
//            System.out.println(I);
//
//        }

//////////////////////////////////////////////////////////////////////////////////////////*/
/*        updateDays(Days.sunday);
        CClass C=new CClass();

        C.print1(); // Override و فعل لها C التي ورثها الكلاس print1() هنا قمنا باستدعاء الدالة
        C.print2(); // Override و فعل لها C التي ورثها الكلاس print2() هنا قمنا باستدعاء الدالة



        Student student= new Student("mohamed",21,70.5,182.7,"349230759");
        student.printInformation();
        student.nationality();
        student.goTOSchool();
        student.breakfast();
        student.dinner();
        student.lunch();

        if (true)return;
        // student.wakeUP();
        // العامل instanceof يستخدم لمعرفة اذا كان الكائن ينتمي الي كلاس معين او لا
       // ويرجع True اذا كان بنتمي الي كلاس والا برجع false
        System.out.println(student instanceof Student);
        System.out.println("This object from class Human :" + false);

        ArabicMan man1=new ArabicMan("Ali",28,79,182.7,"Arabic");
        man1.printInformation();
        man1.nationality();
        EnglishMan man2=new EnglishMan("jhon",30,87.6,180.8,"English");
        man2.printInformation();
        man2.nationality();
        SpanishMan man3=new SpanishMan("Pablo",40,88,170,"Spanish");
        man3.printInformation();
        man3.nationality();*/
///////////////////////////////////////////////////////////////////////////////////////////////////
//
//       Student student3=new Student ("ahmed",234342846);
//         Student student2 =new Student ("mohamed",644002896);
//        Student student1=new Student ("mohamed",1243433245);
//      //  Student student2 =new Student (1232465712,"mohamed");
//        student1.printInfo();
//        student2.printInfo();
//        student3.printInfo();
//
//
//        System.out.println(Math.PI);
//       // هاتلي نسخة جديدة من الكلاس وحزنها في الاوبجكت دا
//
//        MyMathClass operationSum1= new MyMathClass();
//        operationSum1.mathFunction();
//
//        MyMathClass operationSum2= new MyMathClass();
//        operationSum2.mathFunction2();
//
//        MyMathClass mathSum3 =new MyMathClass();
//        mathSum3.mathFunction3();
//
////constructor
//        MyUser myUser1 = new MyUser("mohamed", "medoelbalahy2001@gmail.com", 27);
//        myUser1.printUserData();
//
//        MyUser myUser2= new MyUser("ahmed", "medoelmaher2001@gmail.com", 22);
//        myUser2.printUserData();
//    }


}
    public void Regester(View view) {
        Intent intent = new Intent(MainActivity.this, RegesterActivity.class);
        startActivity(intent);
    }

    public void SignUP(View view) {
        Intent intent = new Intent(MainActivity.this, SignActivity.class);
        startActivity(intent);

    }
}



