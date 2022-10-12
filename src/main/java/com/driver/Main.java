package com.driver;

class A{
    String meth(){

        return "Method from class A";
    }
}
class B extends A{
    String meth(){

        return "Method is overridden in extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        B object = new B();
        object.meth();
    }
}
