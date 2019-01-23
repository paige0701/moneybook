package com.study.moneybook;


import com.study.moneybook.repository.UserEntity;
import com.study.moneybook.repository.UserRepository;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void userTest() {

        UserEntity user = new UserEntity();
        user.setEmail("paige11@gmail.com");
        user.setFirstName("Jenny");
        user.setLastName("Kim");
        user.setCreatedTime(new DateTime().toString());
        user.setModifiedTime(user.getCreatedTime());
        userRepository.save(user);
    }

}

