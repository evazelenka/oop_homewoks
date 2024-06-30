package ex03.StudentGroup;

import java.util.Iterator;

import ex03.Student.Student;

public class StudentGroupIterator implements Iterator<Student> {

    private StudentGroup studentGroup;

    private int index = 0;

    public StudentGroupIterator(StudentGroup group) {
        this.studentGroup = group;
    }

    private Student[] getStudents(){
        String[] names = studentGroup.students.toString().split(" ");
        Student[] students = new Student[names.length];

        int count = 0;
        for(String name : names){
            students[count] = new Student(name, count);
            count++;
        }
        return students;
    }
    @Override
    public boolean hasNext() {
        return index < getStudents().length;
    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }
    
}
