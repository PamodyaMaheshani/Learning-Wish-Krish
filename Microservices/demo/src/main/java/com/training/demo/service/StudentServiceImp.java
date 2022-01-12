package com.training.demo.service;

import com.training.demo.model.Student;
import com.training.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //to create a bean for this class
public class StudentServiceImp implements StudentService{

    //service has to deal with the repository
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
