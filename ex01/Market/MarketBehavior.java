package ex01.Market;

import java.util.List;

import ex01.Actor.Actor;

public interface MarketBehavior {

    /**
     * Входят в магазин
     * @param actor
     */
    void acceptToMarket(List<Actor> actors);

    void acceptToMarket(Actor actor);

    /**
     * Выходят из магазина
     * @param actors
     */
    void releaseFromMarket();

    /**
     * Обновление состояния в очереди
     */
    void upDate();
}
