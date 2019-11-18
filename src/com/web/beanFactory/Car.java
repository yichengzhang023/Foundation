package com.web.beanFactory;

public class Car {
    private String brand;
    private double price;
    private String factory;
    private double tyrePerimeter;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", factory='" + factory + '\'' +
                ", tyrePerimeter=" + tyrePerimeter +
                '}';
    }

    public double getTyrePerimeter() {
        return tyrePerimeter;
    }

    public void setTyrePerimeter(double tyrePerimeter) {
        this.tyrePerimeter = tyrePerimeter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public void init(){
        System.out.println("Initialized");
    }

    public void destroy(){
        System.out.println("Destroy");
    }

}