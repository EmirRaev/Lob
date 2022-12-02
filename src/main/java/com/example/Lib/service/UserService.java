package com.example.Lib.service;

import com.example.Lib.dao.UserRepository;
import com.example.Lib.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users FindByLogin(String name) {
    }
}
