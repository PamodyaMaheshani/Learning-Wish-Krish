package com.training.demo.controller;

import com.training.demo.model.Student;
import com.training.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    // controller is used to route the traffic.
    @Autowired
    StudentService studentService;

    // @RequestMapping - map the request into the java method
    // capable to handle both GET and POST requests (without method attribute)
    // with method attribute, it specifies which request needs to be accepted
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting() {
        return "Hi.. this is for GET request..";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String reading() {
        return "Hi.. this is for POST request..";
    }

    // create an endpoint
    // do not use endpoint names like addstudent, deletestudent, this process done by the request. it affects to the object. so, use object name
    // in @RequestBody, converts the studentmodel object
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    // there are 2 situations. Can be student data. or have not any student data
    // use ResponseEntity. it can check the response code
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id) {

        Student student = studentService.fetchStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(student);
        }
    }

}
