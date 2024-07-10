package ex06;

public class UserService implements Persister, Report{

    private User user;

    @Override
    public void report(User user) {
        this.user = user;
        System.out.println("Report for user: " + user.getName());
    }

    @Override
    public void save(User user) {
        this.user = user;
        System.out.println("Save user: " + user.getName());
    }
    
}
