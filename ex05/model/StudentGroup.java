package ex05.model;

import java.util.ArrayList;
import java.util.List;

import ex05.model.impl.Student;
import ex05.model.impl.Teacher;

public class StudentGroup {
    
    public List<Student> students = new ArrayList<>();

    public Teacher teacher;

    public int groupId;

    public StudentGroup(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Group: " + groupId + " Teacher: " + teacher + " Students: " + students;
    }
}
