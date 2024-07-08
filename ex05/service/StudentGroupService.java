package ex05.service;

import java.util.List;

import ex05.model.StudentGroup;
// import ex05.model.Db.DataBase;
import ex05.model.impl.Teacher;
import ex05.model.impl.Student;

public class StudentGroupService {
    
    private StudentGroup group;
    private int count = 1;

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students){
        group.groupId = count;
        group.teacher = teacher;
        group.students = students;
        teacher.groups.add(count);
        count++;
        return group;
    }

    public StudentGroup getGroup() {
        return group;
    }

    
}
