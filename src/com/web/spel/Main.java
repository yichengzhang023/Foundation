package com.web.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext aptx = new ClassPathXmlApplicationContext("beans-spel.xml");

        Address address = (Address) aptx.getBean("address");
        System.out.println(address);

        Car car = (Car) aptx.getBean("car");
        System.out.println(car);

        Person person = (Person) aptx.getBean("person");
        System.out.println(person);
    }
}
