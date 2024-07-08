package ex05.model.impl;

import ex05.model.User;

public class Student extends User {

    public int groupId;

    public Student(int id, String name, String lastName, int groupId) {
        super(id, name, lastName);
        this.groupId = groupId;
    }
    
}
