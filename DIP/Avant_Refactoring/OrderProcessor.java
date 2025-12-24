public class OrderProcessor {
    private final MySQLDatabase database;  // Dépendance directe sur une implémentation concrète !

    public OrderProcessor() {
        this.database = new MySQLDatabase();  // Couplage fort
    }

    public void processOrder(String order) {
        database.save(order);
    }
}