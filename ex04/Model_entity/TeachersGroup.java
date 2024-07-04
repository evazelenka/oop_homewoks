package ex04.Model_entity;

import java.util.Iterator;
import java.util.List;

import ex04.util.TeacherIterator;

public class TeachersGroup implements Iterable<Teacher>{
    
    public List<Teacher> teachers;

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherIterator(this);
    }
}
