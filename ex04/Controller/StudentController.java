package ex04.Controller;

import java.util.List;

import ex04.Model_entity.Student;
import ex04.Model_entity.User;
import ex04.view.StudentView;
import ex04.view.UserView;

public class StudentController implements UserController {

    private UserView<Student> view = new StudentView();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnCoonsole(List<Student> students){
        view.sendOnConsole(students);
    }

    
}
