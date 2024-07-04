package ex04.Service;

import java.util.List;

import ex04.Model_entity.Teacher;
import ex04.Model_entity.TeachersGroup;

public class TeacherService{

    private TeachersGroup group = new TeachersGroup();
    
    public Teacher createTeacher(int id, String name, String lastName){
        return new Teacher(id, name, lastName);
    }

    public void editTeacher(int id, String newName, String newLastName){
        for(Teacher t : group.teachers){
            if (t.getId() == id){
                t.setName(newName);
                t.setLastName(newLastName);
            }
        }
    }

    public TeachersGroup getTeachers(){
        return group;
    }

    public void addTeachers(List<Teacher> teachers){
        this.group.teachers = teachers;
    }

}
