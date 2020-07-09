package com.leodelmiro.springbootmongodb.services;

import com.leodelmiro.springbootmongodb.domain.User;
import com.leodelmiro.springbootmongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
