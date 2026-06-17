package org.example;

public class Dev {

    private int age = 4;
    public Dev(){
        System.out.println("dev constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("dev 1 constructor");
    }

    public void Build() {
        System.out.println("working on a project");
    }
}
