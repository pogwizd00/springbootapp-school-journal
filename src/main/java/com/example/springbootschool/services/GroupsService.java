package com.example.springbootschool.services;

import com.example.springbootschool.models.Groups;
import com.example.springbootschool.models.Student;
import com.example.springbootschool.repository.GroupsRepozitory;
import com.example.springbootschool.repository.StudentRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class GroupsService {

    private final GroupsRepozitory groupsRepozitory;
    private final StudentRepozitory studentRepozitory;

    @Autowired
    public GroupsService(GroupsRepozitory groupsRepozitory,
                         StudentRepozitory studentRepozitory) {
        this.groupsRepozitory = groupsRepozitory;
        this.studentRepozitory = studentRepozitory;
    }

    public List<Groups> getGroups(){
        List<Groups>allGroups = groupsRepozitory.findAll();
        return allGroups;
    }
    public Optional<Groups> getGroupByid(long id){
        return groupsRepozitory.findById(id);
    }

    public Groups addGroup(Groups g1){
        return groupsRepozitory.save(g1);
    }

    public void removeGroupById(long id){
        groupsRepozitory.deleteById(id);
    }

    public List<Student>getStudentsInGroupByIdGroup(long idG){
        List<Student>StudentList = studentRepozitory.findAll();
        List<Student>FoundStudents = new ArrayList<>();
        for(Student student : StudentList){
            if(student.getIdG()==idG){
                FoundStudents.add(student);
            }
        }
        return FoundStudents;
    }

    public String getFillGroup(long idG){
        Optional<Groups> foundGroup = Optional.of(groupsRepozitory.getReferenceById(idG));
        List<Student>AllStudents = studentRepozitory.findAll();
        double size=0.;
        for(Student student : AllStudents){
            if(student.getIdG()==idG){
                size++;
            }
        }
        double fillGroup = (size/foundGroup.get().getSizeGroup())*100;
        return String.valueOf(fillGroup + "%");
    }

}
