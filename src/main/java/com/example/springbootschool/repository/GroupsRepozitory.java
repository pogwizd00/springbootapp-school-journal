package com.example.springbootschool.repository;

import com.example.springbootschool.models.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


//it give me acces to data from my databse
@Repository
public interface GroupsRepozitory extends JpaRepository<Groups,Long> {

}
