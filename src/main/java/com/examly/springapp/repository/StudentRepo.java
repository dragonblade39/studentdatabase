package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long>{

}
