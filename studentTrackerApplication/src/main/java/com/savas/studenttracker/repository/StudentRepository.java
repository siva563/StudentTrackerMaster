package com.savas.studenttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savas.studenttracker.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
