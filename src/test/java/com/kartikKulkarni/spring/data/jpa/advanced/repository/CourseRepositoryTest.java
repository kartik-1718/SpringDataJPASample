package com.kartikKulkarni.spring.data.jpa.advanced.repository;

import com.kartikKulkarni.spring.data.jpa.advanced.entity.Course;
import com.kartikKulkarni.spring.data.jpa.advanced.entity.Student;
import com.kartikKulkarni.spring.data.jpa.advanced.entity.Teacher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses() {
        List<Course> courses =
                courseRepository.findAll();

        System.out.println("courses = " + courses);
    }

    @Test
    public void saveCourseWithTeacher() {
        Teacher teacher = Teacher.builder()
                .firstName("Priyanka")
                .lastName("Singh")
                .build();

        Course course = Course.builder()
                .title("Python")
                .credit(6)
                .teacher(teacher)
                .build();

        courseRepository.save(course);
    }

    @Test
    public void saveCourseWithStudentAndTeacher(){

        Teacher teacher = Teacher.builder()
                .firstName("Johny")
                .lastName("Bairstow")
                .build();

        Student student = Student.builder()
                .firstName("Steve")
                .lastName("Smith")
                .emailId("smith@gmail.com")
                .build();
       Course course = Course.builder()
                .title("AI")
                .credit(5)
                .teacher(teacher)
                .build();


        course.addStudents(student);

        courseRepository.save(course);
    }

}