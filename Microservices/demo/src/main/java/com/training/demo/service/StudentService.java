package com.training.demo.service;

import com.training.demo.model.Student;

public interface StudentService {
    // service is used to hold the data
    // always good to use interface-driven programming

    Student save(Student student);
    Student fetchStudentById(int id);
}
