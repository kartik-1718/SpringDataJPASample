package com.kartikKulkarni.spring.data.jpa.advanced.repository;

import com.kartikKulkarni.spring.data.jpa.advanced.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
