public class OrderProcessor {
    private final Database database;  // Dépend d'une abstraction, pas d'une implémentation concrète

    public OrderProcessor(Database database) {  // Injection de dépendance
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
}