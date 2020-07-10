package com.jc.Test;


public class Hello {

    public static void main(String[] args) {
        A ab = new B();
        System.out.println("- - - - - - - - - - - - - - -1");
        ab = new B();
        System.out.println("- - - - - - - - - - - - - - -2");
        ab.A();
        System.out.println("- - - - - - - - - - - - - - -3");
        B b = new B();
        System.out.println("- - - - - - - - - - - - - - -4");
        b.B();
        System.out.println("- - - - - - - - - - - - - - -5");
        b.A();


    }
}
