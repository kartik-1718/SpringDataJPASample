package com.kartikKulkarni.spring.data.jpa.advanced.repository;

import com.kartikKulkarni.spring.data.jpa.advanced.entity.Course;
import com.kartikKulkarni.spring.data.jpa.advanced.entity.Teacher;
import net.bytebuddy.ClassFileVersion;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){


        Course courseDBA = Course.builder()
                .title("DBA")
                .credit(5)
                .build();
        Course courseJava = Course.builder()
                .title("Java")
                .credit(6)
                .build();


        Teacher teacher =
                Teacher.builder()
                        .firstName("King")
                        .lastName("Kohli")
                        //.courses(List.of(courseDBA,courseJava))
                        .build();

        teacherRepository.save(teacher);
    }
}