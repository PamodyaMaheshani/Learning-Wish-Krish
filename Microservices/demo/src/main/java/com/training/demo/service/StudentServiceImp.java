package com.training.demo.service;

import com.training.demo.model.Student;
import com.training.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // to create a bean for this class
public class StudentServiceImp implements StudentService{

    // service has to deal with the repository
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    // return the student data based on the ID
    // this can be done in controller too. But here is the suited place
    public Student fetchStudentById(int id) {

        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()) {
            return student.get();
        }
        else {
            return null;
        }
    }
}
