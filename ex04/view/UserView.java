package ex04.view;

import java.util.List;

import ex04.Model_entity.User;

public interface UserView<T extends User> {
    
    void sendOnConsole(List<T> users);
}
