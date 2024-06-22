/*
Симулирует реальную базу данных
 */
package com.exemple.uni.model.DB;

import com.exemple.uni.model.StudentGroup;
import com.exemple.uni.model.impl.Student;
import com.exemple.uni.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();

    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static final List<StudentGroup> gropDB = new ArrayList<>();

    public static void fillDB() {
        Teacher teacher = new Teacher(1, "Вася", "Иванов");
        teacher.addGroupID(1);
        teachersDB.add(teacher);
        Student s1 = new Student(1, "Рикон", "Старк", 1);
        Student s2 = new Student(2, "Джофри", "Ланистар", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);
        StudentGroup studentGroup = new StudentGroup(1, teacher, studentsDB);
    }
}
