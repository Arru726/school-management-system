package com.aryaveer.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aryaveer.schoolmanagement.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}