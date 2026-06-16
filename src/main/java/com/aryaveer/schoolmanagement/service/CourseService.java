package com.aryaveer.schoolmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aryaveer.schoolmanagement.entity.Course;
import com.aryaveer.schoolmanagement.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    public Course updateCourse(Long id, Course course) {

    Course existingCourse = courseRepository.findById(id).orElse(null);

    if (existingCourse != null) {
        existingCourse.setCourseName(course.getCourseName());
        existingCourse.setDuration(course.getDuration());
        existingCourse.setFees(course.getFees());

        return courseRepository.save(existingCourse);
    }

    return null;
    }
}