package controller;

import model.Teatcher;
import model.User;
import view.TeacherView;
import view.UserView;

import java.util.List;

public class TeacherController implements UserController{

    private UserView<Teatcher> view = new TeacherView();

    @Override
    public <T extends User> User create(T user) {
        return null;
    }

    public void sendOnConsole(List<Teatcher> teatchers) {
        view.sendOnConsole(teatchers);
    }
}
