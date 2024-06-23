package com.exemple.uni.controller;

import com.exemple.uni.model.StudentGroup;
import com.exemple.uni.model.impl.Stream;
import com.exemple.uni.model.impl.Student;
import com.exemple.uni.model.impl.Teacher;
import com.exemple.uni.service.GroupService;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    private GroupService service = new GroupService();

    public StudentGroup creatGroupStudent(int id, Teacher teacher, ArrayList<Student> students) {
        return service.creatGroupStudent(id, teacher, students);
    }

    public StudentGroup getById(int id) {

        StudentGroup group = null;
        try {
            group = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return group;
    }

    public List<Stream> getgroup(){
        return service.getgroup();
    }
}
