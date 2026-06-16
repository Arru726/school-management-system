package com.aryaveer.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aryaveer.schoolmanagement.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}