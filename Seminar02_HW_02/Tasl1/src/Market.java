/*
Реализовать класс Market и все методы, которые он обязан реализовывать. Методы из интерфейса QueueBehaviour, имитируют
работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина
(принимает и отдает заказы)
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour{

    private List<Actor> actors = new ArrayList<>(); // список акторов
    private Queue<Actor> actorQueue = new ArrayDeque<>(); // очередь
    private List<String> orders = new ArrayList<>(); // список покупок

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
        System.out.println(actor.getName() + " зашел в магазин");
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(0);
        System.out.println(actor.getName() + " вышел из магазина");
    }

    @Override
    public void update(List<String> orders) {
        System.out.println("Список покупок: " + orders);
        orders.clear();
    }

    @Override
    public void takeInQueue(Actor actor) {
        actorQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь в магазине");
    }

    @Override
    public void takeOrders() {
        actorQueue.peek().isMakeOrder();
        System.out.println(actorQueue.peek().getName() + " сделал заказ в магазине");
    }

    @Override
    public void giveOrders() {
        actorQueue.peek().isTakeOrder();
        System.out.println(actorQueue.peek().getName() + " забрал заказ из магазина");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorQueue.poll().getName() + " покинул очередь");
        actorQueue.poll();
    }
}
