package com.study.moneybook.service;

import com.study.moneybook.repository.CategoryEntity;
import com.study.moneybook.repository.RecordEntity;
import com.study.moneybook.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public List<RecordEntity> getRecord(String categoryType) {
        List<RecordEntity> re;

        if (categoryType != null) {
            re = recordRepository.findByCategoryType(categoryType);
        } else {
            re = recordRepository.findAll();
        }

        return re;
    }

    // user is default


    // monthly 2018-12, monthly
    // 12월 1일, 12월 2일 ...


    // weekly 2018-12, weekly
    // 2018년 12월 보내면
    // 12월 1주, 12월 2주, 12월 3주 이렇게 보낸다



}
