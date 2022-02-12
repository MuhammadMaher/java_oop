package com.example.mma.Human;
// 3 مشكلات هنا بسبب الكلاسات اللي انا عاملها زيادة
 public abstract class Human implements IHumanNature{

     // عشان اعرف اكتب abstract function لازم اخلي ال class معرف كAbstract

        private String name;
        private int age;
        private double weight;
        private double height;


        public Human(String name, int age, double weight, double height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        // Abstract method
        public abstract void nationality();
        //
        public void printInformation() {


            System.out.println("\n"+"Name :" + name);
            System.out.println("Age :" + age);
            System.out.println("Weight :" + weight);
            System.out.println("Height :" + height);


        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
    }


