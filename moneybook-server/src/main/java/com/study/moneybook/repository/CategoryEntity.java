package com.study.moneybook.repository;

import javax.persistence.*;

@Entity
@Table(name="category")
public class CategoryEntity {

    @Id
    @Column
    private String id;

    @Column
    private String type;

    @Column
    private String name;

}
