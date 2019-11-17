package com.web.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext aptx = new ClassPathXmlApplicationContext("beans-lifecycle.xml");
        Car car = (Car) aptx.getBean("car");
        System.out.println(car);

        aptx.close();
    }
}
