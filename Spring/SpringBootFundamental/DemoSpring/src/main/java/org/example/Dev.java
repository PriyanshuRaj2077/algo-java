package org.example;

public class Dev {

   // private Laptop laptop;
    private Computer comp;
//    private int age = 4;


    public Dev(){
        System.out.println("dev constructor");
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public Computer getComputer() {
//        return comp;
//    }
//
//    public void setComputer(Computer comp) {
//        this.comp = comp;
//    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer laptopObj) {
        //"When someone calls this
        // method, they must give me an object that is a Computer."
        this.comp = laptopObj;
    }


//    public Dev(int age) {
//        this.age = age;
//        System.out.println("dev 1 constructor");
//    }

    public void Build() {
        System.out.println("working on a project");
        comp.compile();
    }
}
