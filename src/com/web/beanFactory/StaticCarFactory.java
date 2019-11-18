package com.web.beanFactory;

import java.util.*;

public class StaticCarFactory {
    private static Map<String, Car> cars = new HashMap<>();

    private static Hashtable<String, Car> test = new Hashtable<>();

    static {
        cars.put("audi", new Car("audi", 3000000));
        cars.put("ford", new Car("ford", 4000000));
        test.put("audi", new Car("audi", 3000000));
        test.put("ford", new Car("ford", 4000000));
    }

    public static Car getCar(String name) {
        return cars.get(name);
    }

    public  static Car play(String name){
        return test.get(name);
    }


}
