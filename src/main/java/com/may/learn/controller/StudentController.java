package com.may.learn.controller;

import com.may.learn.model.Student;
import com.may.learn.service.GetService;
import com.may.learn.service.RegistrationService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    RegistrationService registrationService=new RegistrationService();
    GetService getService=new GetService();

    @PostMapping("/register")
    public void saveStudent(@RequestParam int id,@RequestParam String name)
    {
     registrationService.saveStudent(id,name);
    }

    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable int id)
    {
        Student response=getService.getStudentById(id);
        if(response==null)
        {
            return "No Student present with the id passed";
        }
        else
        {
            return "Congo student is present";
        }
    }
}
