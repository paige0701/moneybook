package com.study.moneybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity, Long> {

    RecordEntity findById(String id);
    RecordEntity findByCategory(CategoryEntity category);

}
