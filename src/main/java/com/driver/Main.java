package com.driver;

class A{
    void meth(){

        System.out.println("Method from class A");
    }
}
class B extends A{
    void meth(){
        System.out.println("Method is overridden in extended class B");
    }
}

public class Main {
    public static void main(String[] args) {
        B object = new B();
        object.meth();
    }
}
