import java.util.ArrayList;
import java.util.List;

/*
1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине.
2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать заказ и
факт получения заказа.
3. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, принятие/отдача
заказа. void: takeInQueue(Actoractor); void: takeOrders(); void: giveOrders(); void: releaseFromQueue()
4. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния
магазина void: acceptToMarket(Actor actor); void: releaseFromMarket(List<Actor> actors); void: update();
 */
public class Main {
    public static void main(String[] args) {
        Human hm = new Human("Егор");
        Human hm1 = new Human("Андрей");
        List<String> buys = new ArrayList<>();
        Market shop = new Market();

        shop.acceptToMarket(hm);
        shop.takeInQueue(hm);
        shop.takeOrders();
        buys.add("Молоко");
        buys.add("Хлеб");
        shop.update(buys);
        shop.giveOrders();
        shop.releaseFromQueue();
        shop.releaseFromMarket(hm);
        shop.acceptToMarket(hm1);
        shop.takeInQueue(hm1);
        shop.takeOrders();
        buys.add("Колбаса");
        buys.add("Сыр");
        buys.add("Йогурт");
        shop.update(buys);
        shop.giveOrders();
        shop.releaseFromQueue();
        shop.releaseFromMarket(hm1);

    }
}