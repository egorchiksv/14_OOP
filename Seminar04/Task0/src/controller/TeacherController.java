package controller;

import model.Teacher;
import model.User;
import view.TeacherView;
import view.UserView;

import java.util.List;

public class TeacherController implements UserController{

    private UserView<Teacher> view = new TeacherView();

    @Override
    public <T extends User> User create(T user) {
        return null;
    }

    public void sendOnConsole(List<Teacher> teatchers) {
        view.sendOnConsole(teatchers);
    }

}
