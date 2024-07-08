package ex05.controller;

import java.util.List;

import ex05.model.impl.Student;
import ex05.service.StudentService;

public class StudentController {

    public StudentService service = new StudentService();
    
    public Student createStudent(String name, String lastName, int idGroup){
        return service.createStudent(idGroup, name, lastName);
    };

    public Student getById(int id){

        Student student = null;
        try{
            student = service.getById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return student;
    }

    public List<Student> getAllStudents(){
        return service.getStudents();
    }

    public Student changeStudentGroup(int studentId, int newGroupId){
        Student student = null;
        try{
            student = service.changeStudentGroup(studentId, newGroupId);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return student;
    }
}
