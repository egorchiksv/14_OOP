package com.exemple.uni.view;

import com.exemple.uni.controller.StudentController;
import com.exemple.uni.model.DB.DataBase;
import com.exemple.uni.model.impl.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private StudentController controller = new StudentController();

    public void start(){
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студента");
            System.out.println("2 - найти студента по id");
            System.out.println("3 - распечатать информацию о всех студентах");
            System.out.println("4 - выход");
            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudent();
                case 4 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String lastname = scanner.nextLine();
        System.out.println("Введите номер группы: ");
        int groupId = scanner.nextInt();
        Student student = controller.createStudent(name, lastname, groupId);
        System.out.println(student);
        return student;
    };
    private Student getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id студента: ");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    };
    private List<Student> getAllStudent(){
        List<Student> student = controller.getAllStudent();
        System.out.println(student);
        return student;
    };

}
