package org.example;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("laptop constructor");
    }
    public void compile() {
        System.out.println("working on a project on laptop");
    }
}
