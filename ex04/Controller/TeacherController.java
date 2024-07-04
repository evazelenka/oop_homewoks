package ex04.Controller;

import java.util.List;

import ex04.Model_entity.Teacher;
import ex04.Model_entity.User;
import ex04.Service.TeacherService;
import ex04.view.TeacherView;
import ex04.view.UserView;

public class TeacherController implements UserController{

    private UserView<Teacher> view = new TeacherView();
    private TeacherService service = new TeacherService();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }
    
    public void sendOnCoonsole(){
        view.sendOnConsole(service.getTeachers().teachers);
    }

    public void editTeacher(int id, String newName, String newLastName){
        service.editTeacher(id, newName, newLastName);
    }

    public void addTeachers(List<Teacher> teachers){
        service.addTeachers(teachers);
    }
}
