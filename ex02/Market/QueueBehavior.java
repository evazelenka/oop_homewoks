package ex02.Market;

import java.util.ArrayList;
import java.util.List;

import ex02.Actor.Actor;

public interface QueueBehavior {

    public List<Actor> queue = new ArrayList<>();

    /**
     * Встать в очередь
     * @param actor - экземпляр класса в очереди
     */
    void takeInQueue(Actor actor);

    /**
     * Принять заказ
     */
    void takeOrders();

    /**
     * Выдать заказ
     */
    void giveOrders();

    /**
     * Покинуть очередь
     */
    void releaseFromQueue();
}
