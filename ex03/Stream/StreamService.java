package ex03.Stream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamService{
    
    public ArrayList<StudentStream> streams;

    public StreamService(ArrayList<StudentStream> streams) {
        this.streams = streams;
    }

    public void addStream(StudentStream stream){
        streams.add(stream);
    }

    public void streamSort(){
        Collections.sort(streams, new StreamComparator());
        System.out.println(streams);
    }

}
