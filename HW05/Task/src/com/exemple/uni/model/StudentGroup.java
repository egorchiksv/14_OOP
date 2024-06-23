package com.exemple.uni.model;

import com.exemple.uni.model.impl.Student;
import com.exemple.uni.model.impl.Teacher;

import java.util.List;

public class StudentGroup {
    private int id;
    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(int id, Teacher teacher, List<Student> students){
        this.id = id;
        this.teacher = teacher;
        this.students = students;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Группа №" + id + " {" +
                teacher + " " +
                students +
                '}';
    }
}
