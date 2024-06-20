import controller.StudentController;
import controller.StudentGroupController;
import controller.UserController;
import model.Student;
import model.StudentGroup;
import service.StudentGroupService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(1, "Sasha", "Ivanov")));

    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Sasha", "Ivanov");
//        return List.of(s1, s2);
//    }
}