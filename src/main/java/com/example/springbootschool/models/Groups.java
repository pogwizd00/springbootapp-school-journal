package com.example.springbootschool.models;

import jakarta.persistence.*;
import jdk.jfr.Name;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGroup")
    private long idGroup;
    @Column(name = "nameGroup")
    private String nameGroup;
    @Column(name = "sizeGroup")
    private long sizeGroup;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idG", referencedColumnName = "idGroup")
    List<Student> StudentsList = new ArrayList<>();

    public Groups(long idGroup, String nameGraoup, long sizeGroup) {
        this.idGroup = idGroup;
        this.nameGroup = nameGraoup;
        this.sizeGroup = sizeGroup;
    }

    public Groups(String nameGraoup, long sizeGroup) {
        this.nameGroup = nameGraoup;
        this.sizeGroup = sizeGroup;
    }

    public Groups() {

    }

    public void setIdGroup(long idGroup) {
        this.idGroup = idGroup;
    }

    public void setNameGraoup(String nameGraoup) {
        this.nameGroup = nameGraoup;
    }

    public void setSizeGroup(long sizeGroup) {
        this.sizeGroup = sizeGroup;
    }

    public long getIdGroup() {
        return idGroup;
    }

    public String getNameGraoup() {
        return nameGroup;
    }

    public long getSizeGroup() {
        return sizeGroup;
    }
}
