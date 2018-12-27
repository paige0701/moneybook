package com.study.moneybook.controller;

import com.study.moneybook.repository.User;
import com.study.moneybook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="", method = RequestMethod.GET)
    public List<User> getUsers() {
        System.out.println(userRepository.findAll());
        return userRepository.findAll();
    }

}
