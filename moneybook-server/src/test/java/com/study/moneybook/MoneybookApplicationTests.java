package com.study.moneybook;

import com.study.moneybook.repository.User;
import com.study.moneybook.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoneybookApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Autowired
    private UserRepository userRepository;

    @Test
    public void testGetUser() {
        System.out.println(userRepository.findAll());
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId("23");
        user.setName("Paige");
        userRepository.save(user);
    }

}

