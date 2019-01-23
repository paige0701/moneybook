package com.study.moneybook;

import com.study.moneybook.domain.PaymentMethod;
import com.study.moneybook.repository.*;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecordTest {

    @Autowired
    CategoryRepository cr;

    @Autowired
    RecordRepository rr;

    @Autowired
    UserRepository ur;

    @Test
    public void insertRecord() {

        RecordEntity re = new RecordEntity();

        UserEntity user = ur.findByEmail("cde0701@gmail.com");
        re.setAmount(30000);
        re.setCreatedTime(new DateTime().toString());
        re.setModifiedTime(re.getCreatedTime());
//        re.setPaymentMethod(PaymentMethod.CREDIT);
        CategoryEntity cat = cr.findById("I1");
        re.setCategory(cat);
        re.setUser(user);
        rr.save(re);

    }

    @Test
    public void getRecord() {
//        CategoryEntity cat = cr.findById("E3");
//        List<RecordEntity> record = rr.findByCategory(cat);
//        Assert.assertNotNull(record);

    }
}
