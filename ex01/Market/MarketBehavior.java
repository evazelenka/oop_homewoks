package ex01.Market;

import java.util.List;

import ex01.Actor.Actor;

public interface MarketBehavior {

    /**
     * Входят в магазин несколько покупателей
     * @param actor
     */
    void acceptToMarket(List<Actor> actors);

    /**
     * Вошел один покупатель
     * @param actor
     */
    void acceptToMarket(Actor actor);

    /**
     * Выходит один покупатель
     * @param actors
     */
    void releaseFromMarket();

    /**
     * Обновление состояния в магазине
     */
    void upDate();
}
