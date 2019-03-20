package com.example.learnspring.firstclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintHello {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setHello("liquan");
//        helloWorld.printHelloWorld();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld1 = (HelloWorld)applicationContext.getBean("helloworld");
        helloWorld1.printHelloWorld();
    }
}
