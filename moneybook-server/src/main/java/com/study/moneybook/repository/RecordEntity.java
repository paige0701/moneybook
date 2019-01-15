package com.study.moneybook.repository;

import com.study.moneybook.domain.PaymentMethod;
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

    @ManyToOne(targetEntity = CategoryEntity.class)
    private CategoryEntity category;

    // org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl 로 하면 column 이름에 - 를 쓸 수 없다
    @Column(name="paymentmethod")
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

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

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
