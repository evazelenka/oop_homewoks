package ex04.view;

import java.util.List;

import ex04.Model_entity.Student;

public class StudentView implements UserView<Student>{

    @Override
    public void sendOnConsole(List<Student> users) {
        System.out.println(users);
    }
    
}
