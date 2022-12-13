package com.example.springbootschool;

import com.example.springbootschool.models.Groups;
import com.example.springbootschool.models.Student;
import com.example.springbootschool.services.GroupsService;
import com.example.springbootschool.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSchoolApplication implements CommandLineRunner {

	@Autowired
	public SpringbootSchoolApplication(GroupsService groupsService, StudentService studentService) {
		this.groupsService = groupsService;
		this.studentService = studentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSchoolApplication.class, args);
	}

	private final GroupsService groupsService;
	private final StudentService studentService;
	@Override
	public void run(String... args) throws Exception {
//		//add student to table
//		Student newStudent = new Student("Piotr","Pogwizd","OBECNY","04:04:2000",100,1);
//		studentService.addStudent(newStudent);
//		//remove student to table
//		studentService.deleteStudentById(3);
//		//add group to table
//		Groups newGroup = new Groups("gruop2p",10);
//		groupsService.addGroup(newGroup);
//
//		//remove group from table
//		groupsService.removeGroupById(2);

	}
}
