package ex03.Stream;

import java.util.Iterator;

import ex03.StudentGroup.StudentGroup;

public class StudentStream implements Iterable<StudentGroup>{

    public StringBuilder groups = new StringBuilder();
    public String streamName;

    public StudentStream(String streamName) {
        this.streamName = streamName;
    }

    public void addGroups(StudentGroup group) {
        groups.append(group).append(" ");
    }

    public int countGroups(){
        String[] str = groups.toString().split(" ");
        return str.length;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return streamName + " course " + "numberOfGroups: " + countGroups();
    }
    
}
