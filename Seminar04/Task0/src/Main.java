import controller.StudentGroupController;
import model.Student;
import model.StudentGroup;
import service.StudentGroupService;

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentGroupService service = new StudentGroupService(group);

        StudentGroupController controller = new StudentGroupController(service);

        controller.addStudent(new Student());
    }


}