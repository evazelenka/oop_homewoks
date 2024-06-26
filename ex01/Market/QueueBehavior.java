package ex01.Market;

import java.util.ArrayList;
import java.util.List;

import ex01.Actor.Actor;

public interface QueueBehavior {

    public List<Actor> queue = new ArrayList<>();

    /**
     * Встать в очередь
     * @param actor - экземпляр класса в очереди
     */
    void takeInQueue(Actor actor);

    /**
     * Сделать заказ
     */
    void takeOrders();

    /**
     * Забрать заказ
     */
    void giveOrders();

    /**
     * Покинуть очередь
     */
    void releaseFromQueue();
}
