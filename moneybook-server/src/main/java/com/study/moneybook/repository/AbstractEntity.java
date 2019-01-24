package com.study.moneybook.repository;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "created_by")
    protected String createdBy;

    @Column(name = "created_time", updatable = false)
    @CreationTimestamp
    protected LocalDateTime createdTime;

    @Column(name = "modified_by")
    protected String modifiedBy;

    @UpdateTimestamp
    @Column(name = "modified_time")
    protected LocalDateTime modifiedTime;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}

