package com.driver;

class A{
    void meth(){
        System.out.println("Invoking");
    }
}

class B extends A{
    void meth(){
        System.out.print("Method is overridden in extended class B");
    }
}

public class Main {
    public static void main(String[] args) {
        B object = new B();
        object.meth();
    }
}
