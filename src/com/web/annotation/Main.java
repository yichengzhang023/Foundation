package com.web.annotation;

import com.web.annotation.controller.UserController;
import com.web.annotation.generic.UserService;
import com.web.annotation.repository.UserRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext aptx = new ClassPathXmlApplicationContext("beans-annotation.xml");

        UserService userService = (UserService) aptx.getBean("userService");
        userService.add();
//        TestObject to = (TestObject) aptx.getBean("testObject");
//
//
//        UserController userController = (UserController) aptx.getBean("userController");
//        userController.execute();

//        UserService userService = (UserService) aptx.getBean("userService") ;
//        userService.add();
//
//        UserRepositoryImpl userRepository = (UserRepositoryImpl) aptx.getBean("userRepository");
//        userRepository.save();

    }
}
