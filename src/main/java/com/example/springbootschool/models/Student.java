package com.example.springbootschool.models;

import jakarta.persistence.*;

import java.security.GeneralSecurityException;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStudent")
    private long idStudent;
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "studentCondition")
    private String studentCondition;
    @Column(name = "dateOfBirth")
    private String dateOfBirth;
    @Column(name = "points")
    private long points;
    @Column(name = "idG")
    private long idG;
//    @ManyToOne
//    @JoinColumn(insertable = false,nullable = false) //todo trzeba tu dodac idG ale compilator krzyczy ze nie mozna
//    private Groups groupXXX;

    //todo trzeba dodac jeszcze metode zapisu do ktorej grupy student ma byc zapisany po id


    public Student(String name, String lastName, String studentCondition, String dateOfBirth, long points, long idG) {
        this.name = name;
        this.lastName = lastName;
        this.studentCondition = studentCondition;
        this.dateOfBirth = dateOfBirth;
        this.points = points;
        this.idG = idG;
    }

    public Student(long idStudent, String name, String lastName, String studentCondition, String dateOfBirth, long points, long idG) {
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.studentCondition = studentCondition;
        this.dateOfBirth = dateOfBirth;
        this.points = points;
        this.idG = idG;
    }

    public Student() {

    }

    public long getIdStudent() {
        return idStudent;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setIdStudent(long idStudent) {
        this.idStudent = idStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentCondition(String studentCondition) {
        this.studentCondition = studentCondition;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public void setIdG(long idG) {
        this.idG = idG;
    }

    public String getStudentCondition() {
        return studentCondition;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPoints() {
        return points;
    }

    public long getIdG() {
        return idG;
    }
}
