package com.study.moneybook.repository;
import javax.persistence.*;

@Entity
@Table(name="category")
public class CategoryEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name="type")
    private String type;

    @Column(name="name")
    private String name;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
