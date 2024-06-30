package ex03.Stream;

import java.util.Iterator;

import ex03.StudentGroup.StudentGroup;

public class StreamIterator implements Iterator<StudentGroup>{

    private StudentStream stream;

    private int index = 0;

    public StreamIterator(StudentStream str) {
        this.stream = str;
    }

    private StudentGroup[] getGroups(){
        String[] ids = stream.groups.toString().split(" ");
        StudentGroup[] groups = new StudentGroup[ids.length];

        int count = 0;
        for(String id : ids){
            groups[count] = new StudentGroup(id);
            count++;
        }
        return groups;
    }

    @Override
    public boolean hasNext() {
        return index < getGroups().length;
    }

    @Override
    public StudentGroup next() {
        StudentGroup[] sb = getGroups();
        return sb[index++];
    }

    
}
