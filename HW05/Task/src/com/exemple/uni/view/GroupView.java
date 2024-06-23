package com.exemple.uni.view;

import com.exemple.uni.controller.GroupController;
import com.exemple.uni.controller.StudentController;
import com.exemple.uni.controller.TeacherController;
import com.exemple.uni.model.DB.DataBase;
import com.exemple.uni.model.StudentGroup;
import com.exemple.uni.model.impl.Stream;
import com.exemple.uni.model.impl.Student;
import com.exemple.uni.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupView {
    private GroupController controllerGroup = new GroupController();
    private StudentController controllerStudent = new StudentController();
    private TeacherController controllerTeacher = new TeacherController();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("0 - подключить базу данных");
            System.out.println("1 - сформировать новую группу");
            System.out.println("2 - найти группу по id");
            System.out.println("3 - распечатать информацию о группах");
            System.out.println("4 - перейти к базе преподавателей");
            System.out.println("5 - перейти к базе студентов");
            System.out.println("6 - выход");
            switch (scanner.nextInt()) {
                case 0 -> DataBase.fillDB();
                case 1 -> createGroupStudent();
                case 2 -> getById();
                case 3 -> getgroup();
                case 4 -> new TeacherView().start();
                case 5 -> new StudentView().start();
                case 6 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private StudentGroup createGroupStudent(){
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<StudentGroup> groups = new ArrayList<>();
        System.out.println("Введите id группы: ");
        int id = scanner.nextInt();
        System.out.println("Введите id преподавателя: ");
        int idTeacher = scanner.nextInt();
        Teacher teacher = controllerTeacher.getById(idTeacher);
        System.out.println("Введите сколько студентов будет в группе: ");
        int count = scanner.nextInt();
        int number = 1;
        int idStudent;
        while (number <= count) {
            System.out.println("Введите id студента, которого нужно добавить в группу: ");
            idStudent = scanner.nextInt();
            Student student = controllerStudent.getById(idStudent);
            students.add(student);
            count -= 1;
        }
        StudentGroup group = new StudentGroup(id, teacher, students);
        groups.add(group);
        Stream stream = new Stream(groups);
        DataBase.streamDB.add(stream);
        System.out.println(group);
        return group;
    }

    private StudentGroup getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id группы: ");
        int id = scanner.nextInt();
        StudentGroup group = controllerGroup.getById(id);
        System.out.println(group);
        return group;
    }
    private List<Stream> getgroup(){
        List<Stream> stream = controllerGroup.getgroup();
        System.out.println(stream);
        return stream;
    }
}
