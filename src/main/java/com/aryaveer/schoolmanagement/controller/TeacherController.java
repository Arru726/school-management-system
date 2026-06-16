package com.aryaveer.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aryaveer.schoolmanagement.entity.Teacher;
import com.aryaveer.schoolmanagement.service.TeacherService;
import org.springframework.web.bind.annotation.PutMapping;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public Teacher createTeacher(@Valid @RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Long id) {
        return teacherService.getTeacherById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return "Teacher deleted successfully";
    }

    @PutMapping("/{id}")
    public Teacher updateTeacher(
        @PathVariable Long id,
        @Valid @RequestBody Teacher teacher) {

            return teacherService.updateTeacher(id, teacher);
        }
}