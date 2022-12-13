package com.example.springbootschool.repository;

import com.example.springbootschool.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepozitory extends JpaRepository<Student,Long> {

}
