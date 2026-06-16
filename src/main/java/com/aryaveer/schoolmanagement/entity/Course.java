package com.aryaveer.schoolmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String courseName;

    @NotNull(message = "Invalid Time")
    private Integer duration;

    @NotNull(message = "Invalid Fee Amount")
    private Double fees;

    public Course() {
    }

    public Long getId(){
        return id;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public Integer getDuration(){
        return duration;
    }

    public void setDuration(Integer duration){
        this.duration = duration;
    }

    public Double getFees(){
        return fees;
    }

    public void setFees(Double fees){
        this.fees = fees;
    }
}