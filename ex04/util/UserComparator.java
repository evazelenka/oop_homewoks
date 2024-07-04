package ex04.util;

import java.util.Comparator;

import ex04.Model_entity.User;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getId() - o2.getId();
    }
    

}
