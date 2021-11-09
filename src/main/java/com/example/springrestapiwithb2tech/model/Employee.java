package com.example.springrestapiwithb2tech.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class Employee extends BaseEntity {

    private String name;

    private Integer age;

    private String location;

    private String email;

    private String department;
}
