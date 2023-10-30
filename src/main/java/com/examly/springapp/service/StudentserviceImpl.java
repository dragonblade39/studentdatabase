package com.examly.springapp.service;

import com.examly.springapp.model.Student;
import com.examly.springapp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentserviceImpl implements Studentservice{

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student saveDepartment(Student student) {
        Student createdStd=studentRepo.save(student);
        return createdStd;
    }
    @Override
    public List<Student> readAll() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public Optional<Student> readById(Long id){
        return studentRepo.findById(id);
    }
}
