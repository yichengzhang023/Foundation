package com.web.beanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext aptx = new ClassPathXmlApplicationContext("beans-factory.xml");
        Car car = (Car) aptx.getBean("car");
        System.out.println(car);

        Car car1 = (Car) aptx.getBean("car1");
        System.out.println(car1);

        Car car2 = (Car) aptx.getBean("car2");
        System.out.println(car2);

        Car car3 = (Car) aptx.getBean("car3");
        System.out.println(car3);


    }
}
