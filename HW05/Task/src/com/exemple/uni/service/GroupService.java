package com.exemple.uni.service;

import com.exemple.uni.model.DB.DataBase;
import com.exemple.uni.model.StudentGroup;
import com.exemple.uni.model.impl.Stream;
import com.exemple.uni.model.impl.Student;
import com.exemple.uni.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    public List<StudentGroup> groups;
    public StudentGroup creatGroupStudent(int id, Teacher teacher, ArrayList<Student> students) {
        StudentGroup group = new StudentGroup(id, teacher, students);
        DataBase.groupDB.add(group);
        groups.add(group);
        Stream stream = new Stream(groups);
        DataBase.streamDB.add(stream);
        return group;
    }

    public StudentGroup getById(int id) throws Exception {
        StudentGroup group = DataBase.groupDB
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if(group == null) {
            throw new Exception("Группа не найдена");
        }
        return group;
    }

    public List<Stream> getgroup(){
        return DataBase.streamDB;
    }
}
