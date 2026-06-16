package com.aryaveer.schoolmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aryaveer.schoolmanagement.entity.Teacher;
import com.aryaveer.schoolmanagement.repository.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }

    public Teacher updateTeacher(Long id, Teacher teacher) {

    Teacher existingTeacher = teacherRepository.findById(id).orElse(null);

    if (existingTeacher != null) {
        existingTeacher.setName(teacher.getName());
        existingTeacher.setEmail(teacher.getEmail());
        existingTeacher.setSubject(teacher.getSubject());
        existingTeacher.setJoiningYear(teacher.getJoiningYear());
        existingTeacher.setPhone(teacher.getPhone());
        existingTeacher.setDesignation(teacher.getDesignation());

        return teacherRepository.save(existingTeacher);
    }

    return null;
    }
}