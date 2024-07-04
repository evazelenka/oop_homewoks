package ex04.Controller;

import ex04.Model_entity.Student;
import ex04.Service.StudentGroupService;

public class StudentGroupController {
    
    private StudentGroupService service;

    public void addStudent(Student student){
        service.addStudent(student);
    }

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }
}
