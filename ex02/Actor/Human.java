package ex02.Actor;

public class Human extends Actor{

    public Human(String name) {
        super(name);
        isMakeOrder = false;
        isTakeOrder = false;
    }

    public Human(){
        name = "noName";
    }

    @Override
    public String toString() {
        return name + " made o: " + isMakeOrder + ", took o: " + isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean flag) {
        this.isMakeOrder = flag;
    }

    @Override
    public void setTakeOrder(boolean flag) {
        this.isTakeOrder = flag;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
