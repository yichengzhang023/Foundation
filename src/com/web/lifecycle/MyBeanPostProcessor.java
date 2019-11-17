package com.web.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After Initialization: " + bean + "," + beanName);
        Car car = new Car();
        car.setBrand("Ford");
        return car;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before Initialization: " + bean + "," + beanName);
        if(beanName.equals("car")){
            return bean;
        }else{
            return null;
        }
    }
}
