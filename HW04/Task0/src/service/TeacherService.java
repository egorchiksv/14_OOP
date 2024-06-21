package service;

import model.Teacher;

import java.util.List;

public class TeacherService {
    public Teacher createTeacher (int id, String name, String lastname) {
        return new Teacher(id, name, lastname);
    }

    private List<Teacher> teachers;

    public void editTeacher(int id, String name,String lastname) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId().equals(teachers)) {
                teacher.setName(name);
                teacher.setLastName(lastname);
            }
        }
    }
}
