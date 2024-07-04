package ex04.view;

import java.util.List;

import ex04.Model_entity.Teacher;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> users) {
        for(Teacher u : users){
            System.out.printf("id: %d, full name: %s|  ", u.getId(), u);
        }
        System.out.println("");
    }
    
}
