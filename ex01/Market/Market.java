package ex01.Market;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ex01.Actor.Actor;

public class Market implements MarketBehavior, QueueBehavior {

    private List<Actor> actors = new ArrayList<>();

    private int doneOrdersCounter = 0;
    private int allOrdersCounter = 0;
    private int actorsWaitOrder = 0;
    private int actorsGone = 0;
    private int actorsInMarket = 0;
    private int i = 0;

    @Override
    public void acceptToMarket(List<Actor> actors) {
        this.actors.addAll(actors);
        actorsInMarket += actors.size();
        for (Actor a : actors) {
            takeInQueue(a);
        }
    }

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
        takeInQueue(actor);
        System.out.println("new actor came in!");
        actorsInMarket++;
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        if (queue.size() > 0 && i <= queue.size()-1) {
            queue.get(i).isMakeOrder = true;
            actorsWaitOrder++;
            allOrdersCounter++;
            i++;
        } else {
            System.out.println("there is nobody in queue");
        }
    }

    @Override
    public void giveOrders() {
        if (queue.size() > 0) {
            if (queue.get(0).isMakeOrder) {
                queue.get(0).isTakeOrder = true;
                doneOrdersCounter++;
                actorsWaitOrder--;
                releaseFromQueue();
            } else {
                takeOrders();
            }
        } else {
            System.out.println("there is nobody in queue");
        }

    }

    @Override
    public void releaseFromQueue() {
        if (queue.size() > 0) {
            if (queue.get(0).isTakeOrder) {
                System.out.println("order is done!");
            } else {
                System.out.println();
                System.out.println(":(");
                System.out.println("actor gone without order:(");
                System.out.println(":(");
                System.out.println();
                actorsGone++;
                if(actorsWaitOrder > 0){actorsWaitOrder--;}
            }
            queue.remove(0);
        } else {
            System.out.println("there is nobody in the queue");
        }
    }

    @Override
    public void releaseFromMarket() {
        if (actors.size() > 0) {
            actors.remove(0);
            System.out.println("actor is gone");
        } else {
            System.out.println("there is nobody in the market");
        } 
        actorsInMarket--;
    }

    @Override
    public void upDate() { // add argument принимает и отдает заказы
        System.out.println(LocalDateTime.now());
        System.out.printf(
                "actors in market: %d, actors wait orders: %d, done orders today: %d / %d, actors gone without order: %d",
                actorsInMarket, actorsWaitOrder, doneOrdersCounter, allOrdersCounter, actorsGone);
        System.out.println();
    }

    public void getActors(){
        System.out.println(actors);
    }

}
