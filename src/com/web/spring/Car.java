package com.web.spring;

public class Car {

    private String brand;
    private int price;
    private String location;
    private float maxSpeed;

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Car(String brand, int price, String location, float maxSpeed) {
        this.brand = brand;
        this.price = price;
        this.location = location;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", location='" + location + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
