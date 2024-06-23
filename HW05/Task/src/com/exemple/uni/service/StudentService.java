package com.exemple.uni.service;

import com.exemple.uni.model.DB.DataBase;
import com.exemple.uni.model.impl.Student;

import java.util.List;

public class StudentService {
    public Student createStudent (String name, String lastname, int idGroup) {
        int id;
        int size = DataBase.studentsDB.size();
        // id = size + 1;
        if (size == 0) {
            id = 1;
        } else {
            id = size + 1;
        }
        Student student = new Student(id, name, lastname, idGroup);
        DataBase.studentsDB.add(student);
        return student;
    }

    public Student getById(int id) throws Exception {
        Student student = DataBase.studentsDB// Список студентов
                .stream()// запускаем поток для вычислений
                .filter(s -> s.getId() == id)// вызываем метод filter по условию (s = id студента), т.е. этот тот студент. (s -> s.getId() == id) - ламбда выражение
                .findFirst()// вернуть первого найденного с id студента
                .orElse(null);// если не нашли, вернуть null
        if(student == null) {
            throw new Exception("Студент не надйен");
        }
        return student;
    }

    public List<Student> getAllStudent(){
        return DataBase.studentsDB;
    }
}
