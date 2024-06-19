package controller;

import model.Student;
import service.StudentGroupService;

public class StudentGroupController {
    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }
}
