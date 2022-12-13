package com.example.springbootschool.controller;

import com.example.springbootschool.models.Groups;
import com.example.springbootschool.models.Student;
import com.example.springbootschool.services.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GroupsController {
    private final GroupsService groupsService;

    @Autowired
    public GroupsController(GroupsService groupsService) {
        this.groupsService = groupsService;
    }
    @GetMapping(path = "api/course/all")
    private List<Groups> getGroups(){
        return groupsService.getGroups();
    }
    @GetMapping(path = "api/course/{id}")
    private Optional<Groups> getGroupById(@PathVariable String id){
        return groupsService.getGroupByid(Long.parseLong(id));
    }

    @PostMapping(path = "api/course/add")
    private Groups addGroup(Groups g1){
        return groupsService.addGroup(g1);
    }
    @DeleteMapping(path = "api/course/delete/{id}")
    private void removeGroup(@PathVariable String id){
        groupsService.removeGroupById(Long.parseLong(id));
    }
    @GetMapping(path = "api/course/{id}/students")
    private List<Student>getAllStudentsByIdGroup(@PathVariable String id){
        return groupsService.getStudentsInGroupByIdGroup(Long.parseLong(id));
    }
    @GetMapping(path = "api/course/{id}/fill")
    private String getFillGroup(@PathVariable String id){
        return groupsService.getFillGroup(Long.parseLong(id));
    }
}
