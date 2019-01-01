package com.study.moneybook.controller;

import com.study.moneybook.repository.UserEntity;
import com.study.moneybook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="", method = RequestMethod.GET)
    public List<UserEntity> getUsers() {
        System.out.println(userRepository.findAll());
        return userRepository.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public UserEntity getUser(@PathVariable("id") String id) {
        UserEntity user = null;
        if (id != null) {
            System.out.println(userRepository.findById(id).getFirstName());
            user = userRepository.findById(id);
        }
        return user;
    }

}
