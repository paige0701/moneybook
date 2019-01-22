package com.study.moneybook;

import com.study.moneybook.domain.PaymentMethod;
import com.study.moneybook.repository.CategoryEntity;
import com.study.moneybook.repository.CategoryRepository;
import com.study.moneybook.repository.RecordEntity;
import com.study.moneybook.repository.RecordRepository;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecordTest {

    @Autowired
    CategoryRepository cr;

    @Autowired
    RecordRepository rr;

    @Test
    public void insertRecord() {

        RecordEntity re = new RecordEntity();

        re.setAmount(3000);
        re.setCreatedTime(ZonedDateTime.now().toLocalDateTime());
        re.setPaymentMethod(PaymentMethod.CREDIT);
        CategoryEntity cat = cr.findById("E4");
        re.setCategory(cat);
        rr.save(re);

    }

    @Test
    public void getRecord() {
        CategoryEntity cat = cr.findById("E3");
        RecordEntity record = rr.findByCategory(cat);
        Assert.assertNotNull(record);

    }
}
