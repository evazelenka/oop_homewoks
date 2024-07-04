package ex04.Service;

import java.util.Collections;
import java.util.List;

import ex04.Model_entity.Student;
import ex04.Model_entity.StudentGroup;

public class StudentGroupService {
    
    private StudentGroup studentGroup;
    
    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.students.add(student);
    }

    public List<Student> sort(){
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }
}
