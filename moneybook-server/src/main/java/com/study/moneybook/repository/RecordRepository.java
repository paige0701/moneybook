package com.study.moneybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity, Long> {

    RecordEntity findById(String id);
    List<RecordEntity> findByCategoryType(String type);

}
