package com.web.spring;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Car> carList;
    private Car car;


    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        for (Car car : this.carList = carList) {
            
        }
        ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                ", car=" + car +
                '}';
    }
}
