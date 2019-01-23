package com.study.moneybook.repository;
import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public abstract class AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "created_by")
    protected String createdBy;

    @Column(name = "created_time", updatable = false)
    protected String createdTime;

    @Column(name = "modified_by")
    protected String modifiedBy;

    @Column(name = "modified_time")
    protected String modifiedTime;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}

