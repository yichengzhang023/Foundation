package com.web.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext aptx = new ClassPathXmlApplicationContext("autowire.xml");
        Person p = (Person) aptx.getBean("person");
        System.out.println(p.toString());

    }
}
