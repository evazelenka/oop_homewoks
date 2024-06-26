package ex02.Actor;

public abstract class Actor implements ActorBehavior {
    
    /**
     * Имя покупателя
     */
    protected String name;

    /**
     * Заказ сделан(да/нет)
     */
    public boolean isMakeOrder;

    /**
     * Заказ получен(да/нет)
     */
    public boolean isTakeOrder;

    /**
     * Новый покупатель
     * @param name - имя
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Анонимный покупатель
     */
    public Actor(){}

    /**
     * Узнать имя покупателя
     * @return имя
     */
    public abstract String getName();

}
