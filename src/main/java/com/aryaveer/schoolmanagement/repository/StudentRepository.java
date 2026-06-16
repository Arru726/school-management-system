package com.aryaveer.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aryaveer.schoolmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}