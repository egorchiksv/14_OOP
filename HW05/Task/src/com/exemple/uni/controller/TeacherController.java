package com.exemple.uni.controller;

import com.exemple.uni.model.impl.Teacher;
import com.exemple.uni.service.TeacherService;

import java.util.List;

public class TeacherController {
    private TeacherService service = new TeacherService();

    public Teacher createTeacher (String name, String lastname) {
        return service.createTeacher(name, lastname);
    };

    public Teacher getById(int id) {

        Teacher teacher = null;
        try {
            teacher = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public List<Teacher> getAllTeacher(){
        return service.getAllTeacher();
    }
}
