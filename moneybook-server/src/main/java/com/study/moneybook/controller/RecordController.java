package com.study.moneybook.controller;
import com.study.moneybook.repository.RecordEntity;
import com.study.moneybook.service.CategoryService;
import com.study.moneybook.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/record")
public class RecordController {

    @Autowired
    RecordService recordService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public List<RecordEntity> getRecords(
            @RequestParam(value = "month", required = false) String month,
            @RequestParam(value = "categoryType", required = false) String categoryType) {

        List<RecordEntity> record;

        record = recordService.getRecord(categoryType);

        return record;
    }


}
