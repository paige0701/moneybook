package com.study.moneybook.repository;
import org.joda.time.DateTime;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "created_by")
    protected String createdBy;

    @Column(name = "created_time")
    protected DateTime createdTime;

    @Column(name = "modified_by")
    protected String modifiedBy;

    @Column(name = "modified_time")
    protected DateTime modifiedTime;

}
