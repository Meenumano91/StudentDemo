package com.may.learn.repository;

import com.may.learn.model.Student;

import java.util.HashMap;

public class StudentRepo {
    HashMap<Integer, Student> storage=new HashMap<>();

    public void saveStudent(Student student)
    {
        int id=student.id;
        storage.put(id,student);
    }

    public Student getStudentById(int id)
    {
        return storage.get(id);
    }
}
