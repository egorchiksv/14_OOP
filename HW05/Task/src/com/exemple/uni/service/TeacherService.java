package com.exemple.uni.service;

import com.exemple.uni.model.DB.DataBase;
import com.exemple.uni.model.impl.Teacher;

import java.util.List;

public class TeacherService {
    public Teacher createTeacher (String name, String lastname) {
        int id;
        int size = DataBase.teachersDB.size();
        id = size + 1;
        Teacher teacher = new Teacher(id, name, lastname);
        DataBase.teachersDB.add(teacher);
        return teacher;
    }

    public Teacher getById(int id) throws Exception {
        Teacher teacher = DataBase.teachersDB// Список преподавателей
                .stream()
                .filter(s -> s.getId() == id)// вызываем метод filter по условию (s = id преподавателя), т.е. этот тот преподаватель. (s -> s.getId() == id) - ламбда выражение
                .findFirst()// вернуть первого найденного с id преподавателя
                .orElse(null);// если не нашли, вернуть null
        if(teacher == null) {
            throw new Exception("Преподаватель не надйен");
        }
        return teacher;
    }

    public List<Teacher> getAllTeacher(){
        return DataBase.teachersDB;
    }
}
