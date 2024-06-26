package ex01.Actor;

public abstract class Actor implements ActorBehavior {
    
    protected String name;
    public boolean isMakeOrder;
    public boolean isTakeOrder;
    public Actor(String name) {
        this.name = name;
    }

    public Actor(){}

    public abstract String getName();

}
