package com.study.moneybook.controller;

import com.study.moneybook.repository.User;
import com.study.moneybook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="", method = RequestMethod.GET)
    public List<User> getUsers() {
        System.out.println(userRepository.findAll());
        return userRepository.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") String id) {
        User user = null;
        if (id != null) {
            System.out.println(userRepository.findById(id).getName());
            user = userRepository.findById(id);
        }
        return user;
    }

}
