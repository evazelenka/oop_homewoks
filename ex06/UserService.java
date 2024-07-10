package ex06;

public class UserService{

    private User user;
    
    public void report(User user) {
        this.user = user;
        System.out.println("Report for user: " + user.getName());
    }

    public void save(User user) {
        this.user = user;
        System.out.println("Save user: " + user.getName());
    }
    
}
