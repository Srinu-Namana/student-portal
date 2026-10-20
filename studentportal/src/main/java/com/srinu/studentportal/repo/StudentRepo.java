package com.srinu.studentportal.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.srinu.studentportal.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    Optional<Student> findByFname(String fname);

}