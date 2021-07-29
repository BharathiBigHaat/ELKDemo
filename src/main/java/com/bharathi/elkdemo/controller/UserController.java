package com.bharathi.elkdemo.controller;

import com.bharathi.elkdemo.model.User;
import com.bharathi.elkdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){

        log.debug(user.toString());
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id){
        log.debug("id:"+id);
        Optional<User> user= userService.getUser(id);
        try {
           user.orElseThrow();
        }catch (Exception e){
            log.error(e.toString());
        }
        return user.get();
    }
}
