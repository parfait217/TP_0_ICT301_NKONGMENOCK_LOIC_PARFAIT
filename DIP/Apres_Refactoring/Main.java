public class Main {
    public static void main(String[] args) {

        System.out.println("=== RESPECT DU PRINCIPE DIP (Dependency Inversion Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        String orderData = "Données à sauvegarder";

        // Test avec MySQL
        System.out.println("1. Utilisation avec MySQLDatabase :");
        Database mysql = new MySQLDatabase();
        OrderProcessor order1 = new OrderProcessor(mysql);
        order1.processOrder(orderData);
        System.out.println();

        // Test avec MongoDB → même OrderProcessor, aucune modification !
        System.out.println("2. Utilisation avec MongoDBDatabase (changement facile) :");
        Database mongo = new MongoDBDatabase();
        OrderProcessor order2 = new OrderProcessor(mongo);
        order2.processOrder(orderData);
        System.out.println();

        System.out.println("SOLUTION DIP APPLIQUÉE :");
        System.out.println("→ OrderProcessor dépend d'une ABSTRACTION (interface Database).");
        System.out.println("→ Les implémentations concrètes (MySQL, MongoDB) sont injectées.");
        System.out.println("→ Facile à changer, tester, étendre (ajouter PostgreSQL, fichier, etc.).");
        System.out.println("→ Module haut niveau indépendant des détails bas niveau ✔️");
        System.out.println("→ PRINCIPE DIP RESPECTÉ");
    }
}