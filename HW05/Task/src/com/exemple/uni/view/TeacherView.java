package com.exemple.uni.view;

import com.exemple.uni.controller.TeacherController;
import com.exemple.uni.model.DB.DataBase;
import com.exemple.uni.model.impl.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    private TeacherController controller = new TeacherController();

    public void start(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать преподавателя");
            System.out.println("2 - найти преподавателя по id");
            System.out.println("3 - распечатать информацию о всех преподавателях");
            System.out.println("4 - вернуться назад");
            System.out.println("5 - выход");
            switch (scanner.nextInt()) {
                case 1 -> createTeacher();
                case 2 -> getById();
                case 3 -> getAllTeacher();
                case 4 -> new GroupView().start();
                case 5 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private Teacher createTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String lastname = scanner.nextLine();
        Teacher teacher = controller.createTeacher(name, lastname);
        System.out.println(teacher);
        return teacher;
    }
    private Teacher getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподавателя: ");
        int id = scanner.nextInt();
        Teacher teacher = controller.getById(id);
        System.out.println(teacher);
        return teacher;
    }
    private List<Teacher> getAllTeacher(){
        List<Teacher> teacher = controller.getAllTeacher();
        System.out.println(teacher);
        return teacher;
    }
}
