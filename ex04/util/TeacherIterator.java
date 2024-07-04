package ex04.util;

import java.util.Iterator;

import ex04.Model_entity.Teacher;
import ex04.Model_entity.TeachersGroup;

public class TeacherIterator implements Iterator<Teacher>{

    private TeachersGroup group;

    private int index = 0;

    public TeacherIterator(TeachersGroup group) {
        this.group = group;
    }

    private Teacher[] getTeachers(){
        String[] fullName = group.teachers.toString().split("  ");
        String[] names = new String[fullName.length];
        String[] lastNames = new String[names.length];
        int i = 0;
        for(String nam : fullName){
            String[] temp = nam.split(" ");
            if(temp.length > 1){
                names[i] = temp[0];
                lastNames[i] = temp[1];
            }else names[i] = temp[0];
            
        }

        Teacher[] teachers = new Teacher[names.length];

        int count = 0;
        for(String name : names){
            teachers[count] = new Teacher(count, name, lastNames[count]);
            count++;
        }
        return teachers;
    }

    @Override
    public boolean hasNext() {
        return index < getTeachers().length;
    }

    @Override
    public Teacher next() {
        Teacher[] teachers = getTeachers();
        return teachers[index++];
    }
    
}
