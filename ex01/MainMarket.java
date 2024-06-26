package ex01;

import java.util.List;

import ex01.Market.Market;

import ex01.Actor.Actor;

import ex01.Actor.Human;

public class MainMarket {
    public static void main(String[] args) {
        Actor act = new Human("Eva");
        Actor nika = new Human("Veronika");
        Actor ivan = new Human("Ivan");
        Actor vitya = new Human("Viktor");
        Actor nn = new Human();
        Actor ily = new Human("Ilya");
        Actor masha = new Human("Maria");
        Actor dima = new Human("Dmitriy");
        Actor katya = new Human("Ekaterina");
        Actor anya = new Human("Anna");
        Actor nn2 = new Human();
        Actor lisa = new Human("Elizabeth");

        Market shestyorochka = new Market();
        shestyorochka.acceptToMarket(List.of(act, nika, ivan, vitya, nn, nn2, ily, dima, masha, katya, anya, lisa));

        shestyorochka.getActors();

        
        shestyorochka.takeOrders();
        shestyorochka.takeOrders();
        shestyorochka.takeOrders();
        shestyorochka.giveOrders();
        shestyorochka.giveOrders();
        shestyorochka.giveOrders(); 
        

        shestyorochka.getActors();
        shestyorochka.releaseFromMarket();

        shestyorochka.upDate();


        shestyorochka.getActors();

        shestyorochka.acceptToMarket(act);
        shestyorochka.upDate();


    }
}
