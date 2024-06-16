public interface QueueBehaviour {
    void takeInQueue(Actor actor);// встал в очередь
    void takeOrders(); // сдедал заказ
    void giveOrders(); // забрать заказ
    void releaseFromQueue(); // покинуть очередь
}
