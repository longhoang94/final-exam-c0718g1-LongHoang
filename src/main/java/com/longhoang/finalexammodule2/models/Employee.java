package com.longhoang.finalexammodule2.models;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "name can't blank")
    private String name;

    @OneToMany(targetEntity = EmployeeGroup.class)
    @JoinColumn(name = "employee_group_id")
    private EmployeeGroup employeeGroup;

    private String gender;

    @Pattern(regexp = "[0-9]{2}/[0-9]{2}/[0-9]{2}", message = "example: dd/MM/yy")
    private String dayOfBirth;

    @Pattern(regexp = "^0[0-9]{9}$", message = "start with 0 and have 10 numbers")
    private String phoneNumber;

    @NotBlank
    @NotNull(message = "id Card can't null")
    private String idCard;

    @NotBlank(message = "Can't blank. Email example: abc@gmail.com")
    private String email;

    @NotBlank
    private String address;

    public Employee() {
    }

    public Employee(String name, String gender, String dayOfBirth, String phoneNumber, String idCard, String email, String address) {
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.phoneNumber = phoneNumber;
        this.idCard = idCard;
        this.email = email;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EmployeeGroup getEmployeeGroup() {
        return employeeGroup;
    }

    public void setEmployeeGroup(EmployeeGroup employeeGroup) {
        this.employeeGroup = employeeGroup;
    }
}
