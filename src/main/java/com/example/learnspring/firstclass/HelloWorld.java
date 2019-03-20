package com.example.learnspring.firstclass;

public class HelloWorld {

    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public void printHelloWorld() {
        System.out.println("hello====" + hello);
    }
}
