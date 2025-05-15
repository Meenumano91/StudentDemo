package com.may.learn.service;

import com.may.learn.model.Student;
import com.may.learn.repository.StudentRepo;

public class GetService {

    StudentRepo studentRepo=new StudentRepo();

    public Student getStudentById(int id)
    {
        return studentRepo.getStudentById(id);
    }
}
