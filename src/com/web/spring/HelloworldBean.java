package com.web.spring;

public class HelloworldBean {

    private String name;

    public HelloworldBean() {
        System.out.println("DEFAULT CONSTRUCTOR");

    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Name is:" + name);
    }
}
