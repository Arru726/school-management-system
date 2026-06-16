package com.aryaveer.schoolmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aryaveer.schoolmanagement.entity.Student;
import com.aryaveer.schoolmanagement.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student student) {

    Student existingStudent = studentRepository.findById(id).orElse(null);

    if (existingStudent != null) {
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setCourse(student.getCourse());
        existingStudent.setYear(student.getYear());
        existingStudent.setPhone(student.getPhone());

        return studentRepository.save(existingStudent);
    }

    return null;
    }
}