package com.project.david.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.david.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
