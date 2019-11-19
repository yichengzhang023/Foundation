package com.web.annotation.service;

import com.web.annotation.repository.UserRepository;
import com.web.annotation.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private UserRepository userRepository;

    @Autowired
    @Qualifier("test")
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add() {
        userRepository.save();
        System.out.println("User Service add...");
    }
}
