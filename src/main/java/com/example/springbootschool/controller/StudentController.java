package com.example.springbootschool.controller;

import com.example.springbootschool.models.Student;
import com.example.springbootschool.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping(path = "api/student/all")
    private List<Student>getAllStudents(){
        return studentService.geAllStudents();
    }
    @PostMapping(path = "api/student/add")
    private Student addStudent(Student s1){
        return studentService.addStudent(s1);
    }
    @DeleteMapping(path = "api/student/delete/{id}")
    private void deleteStudent(@PathVariable String id){
        studentService.deleteStudentById(Long.parseLong(id));
    }

}
