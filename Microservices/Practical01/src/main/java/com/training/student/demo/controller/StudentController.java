package com.training.student.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //map the request into the java method
    //capable to handle both GET and POST requests (without method attribute)
    //with method attribute, it specifies which request needs to be accepted
    @RequestMapping(value = "/study", method = RequestMethod.GET)
    public String studying() {
        return "Let's Study (this is for GET request)..";
    }

    @RequestMapping(value = "/study", method = RequestMethod.POST)
    public String reading () {
        return "Let's Study (this is for POST request)..";
    }
}
