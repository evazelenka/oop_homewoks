package ex04.Controller;

import ex04.Model_entity.User;

public interface UserController {
    
    <T extends User> User create(T user);
}
