package com.training.demo.repository;

import com.training.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

// this interface needs to be extended over Repository, CRUD Repository or Gpa Repository
// Repository is the top most one. Others are come from the Repository.
// All have different implementation
public interface StudentRepository extends Repository<Student, Integer> {

    Student save(Student student);
}
