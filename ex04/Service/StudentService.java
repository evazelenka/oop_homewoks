package ex04.Service;

import ex04.Model_entity.Student;

public class StudentService {
    
    public Student createStudent(int id, String name, String lastName){
        return new Student(id, name, lastName);
    }
}
