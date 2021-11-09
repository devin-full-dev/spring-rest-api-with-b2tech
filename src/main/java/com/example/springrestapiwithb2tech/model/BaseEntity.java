package com.example.springrestapiwithb2tech.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public Long createdBy;

    public Long updatedBy;

    public Integer state;

    @CreationTimestamp
    public Date createdDate;

    @UpdateTimestamp
    public Date updatedDate;
}
