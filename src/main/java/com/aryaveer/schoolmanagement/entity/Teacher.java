package com.aryaveer.schoolmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;


@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Subject is required")
    private String subject;

    @NotNull(message = "Invalid Year")
    private Integer joiningYear;

    @NotBlank(message = "Phone number is required")
    private String phone;

    @NotBlank(message = "Designation required")
    private String designation;

    public Teacher() {
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public Integer getJoiningYear(){
        return joiningYear;
    }

    public void setJoiningYear(Integer joiningYear){
        this.joiningYear = joiningYear;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getDesignation(){
        return designation;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }
}