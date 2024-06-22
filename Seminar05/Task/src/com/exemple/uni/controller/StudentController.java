package com.exemple.uni.controller;

import com.exemple.uni.model.impl.Student;
import com.exemple.uni.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService service = new StudentService();

    public Student createStudent (String name, String lastname, int idGroup) {
        return service.createStudent(name, lastname, idGroup);
    };

    public Student getById(int id) {

        Student student = null;
        try {
            student = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }

}
