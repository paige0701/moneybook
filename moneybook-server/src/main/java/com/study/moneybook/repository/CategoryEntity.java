package com.study.moneybook.repository;

import javax.persistence.*;

@Entity
@Table()
public class CategoryEntity extends AbstractEntity {

    @Id
    @Column
    private String id;

    @Column
    private String type;

    @Column
    private String name;

}
