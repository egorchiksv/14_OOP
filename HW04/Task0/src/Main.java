import controller.StudentController;
import controller.TeacherController;
import model.Student;
import model.Teacher;
import service.TeacherService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(2, "Sasha", "Ivanov")));

        new TeacherController()
                .sendOnConsole(List.of(new Teacher(1, "Егений", "Петров"),
                        new Teacher(2, "Руслан", "Иванов")));

        System.out.println(new TeacherService().createTeacher(3, "Алексей", "Федеров"));

    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Sasha", "Ivanov");
//        return List.of(s1, s2);
//    }
}