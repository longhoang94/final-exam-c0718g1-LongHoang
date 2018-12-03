package com.longhoang.finalexammodule2.models;

import javax.persistence.*;

@Entity
@Table(name = "employee_group")
public class EmployeeGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;



    public EmployeeGroup() {
    }

    public EmployeeGroup(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
