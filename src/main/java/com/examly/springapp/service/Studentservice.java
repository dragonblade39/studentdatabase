package com.examly.springapp.service;

import com.examly.springapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface Studentservice {
    Student saveDepartment(Student student);

    List<Student> readAll();



    Optional<Student> readById(Long id);

}
