package com.examly.springapp.controller;

import com.examly.springapp.model.Student;
import com.examly.springapp.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ApiController {

    @org.springframework.beans.factory.annotation.Autowired(required=true)
    private Studentservice studentservice;
    //save a record in db, requestbody, pathvariable
    @PostMapping("/addStudent")
    public ResponseEntity saveDepartment(@RequestBody Student student)
    {
        Student s= studentservice.saveDepartment(student);
        return new ResponseEntity<>(studentservice.saveDepartment(student), HttpStatus.CREATED);
    }

    //read operation
    @GetMapping("/getAllStudent")

    public ResponseEntity<List> readAllDepartment(){
        return new ResponseEntity<>(studentservice.readAll(),HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Optional> readDepartmentById(@PathVariable("id") Long id){
        return new ResponseEntity<>(studentservice.readById(id), HttpStatus.OK);
    }
}
