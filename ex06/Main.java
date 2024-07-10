package ex06;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserService service = new UserService();
        service.report(user);
        service.save(user);
    }
}