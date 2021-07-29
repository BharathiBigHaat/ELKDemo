package com.bharathi.elkdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bharathi.elkdemo.model.User;
import com.bharathi.elkdemo.repository.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }
    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public Optional<User> getUser(Integer id) {
        return repository.findById(id);
    }
}
