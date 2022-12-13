package com.example.springbootschool.services;

import com.example.springbootschool.models.Student;
import com.example.springbootschool.repository.StudentRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepozitory studentRepozitory;

    @Autowired
    public StudentService(StudentRepozitory studentRepozitory) {
        this.studentRepozitory = studentRepozitory;
    }
    public List<Student>geAllStudents(){
        List<Student>StudentList = studentRepozitory.findAll();
        return StudentList;
    }
    public Student addStudent(Student s1){
        return studentRepozitory.save(s1);
    }

    public void deleteStudentById(long id){
        studentRepozitory.deleteById(id);
    }
}
