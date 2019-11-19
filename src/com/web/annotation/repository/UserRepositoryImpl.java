package com.web.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository("test")
public class UserRepositoryImpl implements UserRepository{
    @Override
    public void save() {
        System.out.println("UserRepository Save...");
    }
}
