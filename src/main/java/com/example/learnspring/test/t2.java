package com.example.learnspring.test;

public class t2 {

    public t2() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("A");
        new t2();
        new t2();

    }
    {
        System.out.println("C");
    }
    static {
        System.out.println("D");
    }
}
