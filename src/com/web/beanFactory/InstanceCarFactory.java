package com.web.beanFactory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private Map<String, Car> cars = new HashMap<>();

    public InstanceCarFactory(){
        cars.put("audi", new Car("audi",320000));
        cars.put("ford", new Car("ford",400202));
    }

    public Car getCar(String brand) {
        return cars.get(brand);
    }
}
