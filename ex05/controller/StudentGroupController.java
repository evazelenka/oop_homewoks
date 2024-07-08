package ex05.controller;

import java.util.List;

import ex05.model.StudentGroup;
import ex05.model.impl.Student;
import ex05.model.impl.Teacher;
import ex05.service.StudentGroupService;
import ex05.service.StudentService;
import ex05.service.TeacherService;

public class StudentGroupController {

    StudentGroupService studentGroupService = new StudentGroupService();
    TeacherService teacherService = new TeacherService();
    StudentService studentService = new StudentService();
    
    public void getStudentGroup(int groupId) throws Exception{

        System.out.print(getGroupById(groupId));
        
    }

    public StudentGroup getGroupById(int groupId){
        StudentGroup stGr = new StudentGroup(groupId);
        stGr = studentService.getByGroupId(groupId);

        try{
            stGr.teacher = teacherService.getTeacherByGroupId(groupId);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return stGr;
        
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students){
        return studentGroupService.createStudentGroup(teacher, students);
    }

    public StudentGroup getGroup() {
        return studentGroupService.getGroup();
    }

}
