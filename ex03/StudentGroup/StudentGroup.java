package ex03.StudentGroup;

import java.util.Iterator;

import ex03.Student.Student;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    
    public StringBuilder students = new StringBuilder();
    public String groupId;

    public StudentGroup(String groupId) {
        this.groupId = groupId;
    }

    public StudentGroup() {
        this.groupId = null;
    }

    @Override
    public String toString() {
        return groupId;
    }

    public void setgroupId(String groupId) {
        this.groupId = groupId;
    }

    public void addStudent(Student student){
        students.append(student).append(" ");
    }

    public int countStudents(){
        String[] str = students.toString().split(" ");
        return str.length;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public int compareTo(StudentGroup o) {
        return this.countStudents() - o.countStudents(); 
    }

}
