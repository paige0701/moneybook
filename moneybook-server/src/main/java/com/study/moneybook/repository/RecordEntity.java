package com.study.moneybook.repository;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="record")
public class RecordEntity extends AbstractEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name="amount")
    private Integer amount;

    @Column(name="memo")
    private String memo;

    @Column(name="category")
    private String category;

    // org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl 로 하면 column 이름에 - 를 쓸 수 없다
    @Column(name="paymentmethod")
    private String paymentMethod;

    @Column(name="type")
    private String type;

    @ManyToOne(targetEntity = UserEntity.class)
    private UserEntity user;


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
