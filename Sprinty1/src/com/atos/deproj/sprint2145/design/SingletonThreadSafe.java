package com.atos.deproj.sprint2145.design;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe ninstance;

    private SingletonThreadSafe(){

    }

    public static SingletonThreadSafe getInstance(){
        if(ninstance== null){
            synchronized (SingletonThreadSafe.class){
                if(ninstance == null){
                    ninstance= new SingletonThreadSafe();
                }
            }
        }
        return ninstance;
    }

}



/*
*
*
* class Parent {
    void show() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is the Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show(); // Output: This is the Child class
    }
}

*
*
*
*
*
*
*
*
*
*
*
*
* class Parent {
    void show() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is the Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent reference holding Child object
        obj.show(); // Output: This is the Child class (Runtime Polymorphism)
    }
}

*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */
