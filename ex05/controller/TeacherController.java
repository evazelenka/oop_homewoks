package ex05.controller;

import java.util.List;

import ex05.model.impl.Teacher;
import ex05.service.TeacherService;

public class TeacherController {
    
    private TeacherService teacherService = new TeacherService();

    public Teacher createTeacher(String name, String lastName){
        return teacherService.createTeacher(name, lastName);
    }

    public void addGroupId(int teacherId, int groupId){
        teacherService.addGroupId(teacherId, groupId);
    }

    public Teacher getTeacherById(int id){
        Teacher teacher = null;

        try{
            teacher = teacherService.getTeacherById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public Teacher getTeacherByGroupId(int groupId){
        Teacher teacher = null;

        try{
            teacher = teacherService.getTeacherByGroupId(groupId);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public List<Teacher> getTeachers(){
        return teacherService.getTeachers();
    }

}
