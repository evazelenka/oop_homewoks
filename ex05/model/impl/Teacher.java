package ex05.model.impl;

import java.util.ArrayList;
import java.util.List;

import ex05.model.User;

public class Teacher extends User {

    public final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }

    @Override
    public String toString() {
        return "Teacher: " + name + " " + lastName + " Groups: " + groups;
    }
    
}
