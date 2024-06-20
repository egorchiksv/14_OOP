package service;

import model.Teatcher;

public class TeacherService {
    public Teatcher createTeacher (int id, String name, String lastname) {
        return new Teatcher(id, name, lastname);
    }
}
