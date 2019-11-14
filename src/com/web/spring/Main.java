package com.web.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // IOC 容器
        // ClassPathXmlApplicationContext 是ApplicationContext的一个实现类
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取bean 根据id
        HelloworldBean helloworldBean = (HelloworldBean) applicationContext.getBean("helloworld");
        // 调用bean方法

        Car car1 = (Car) applicationContext.getBean("car");
        System.out.println(car1.toString());

        Car car2 = (Car) applicationContext.getBean("car2");

        System.out.println(car2.toString());
        helloworldBean.hello();

        Person p = (Person) applicationContext.getBean("person");
        System.out.println(p.toString());

        DataSource dataSource = (DataSource) applicationContext.getBean("properties");
        System.out.println(dataSource.toString());

        Person p1 = (Person) applicationContext.getBean("person1");
        System.out.println(p1.toString());

    }
}
