package com.driver;

public class Main {

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

    public void main(String[] args) {
        B obj = new B();
        obj.meth();
    }
}
