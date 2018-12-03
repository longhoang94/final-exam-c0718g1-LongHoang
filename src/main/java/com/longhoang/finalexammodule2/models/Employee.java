package com.longhoang.finalexammodule2.models;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String gender;
    private String dayOfBirth;
    private String idCard;
    private String email;
    private String address;
}
