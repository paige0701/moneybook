package com.study.moneybook.service;

import com.study.moneybook.repository.CategoryEntity;
import com.study.moneybook.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

//    public CategoryEntity getCategoryByType(String categoryType) {
//        return categoryRepository.findByType(categoryType);
//    }
}
