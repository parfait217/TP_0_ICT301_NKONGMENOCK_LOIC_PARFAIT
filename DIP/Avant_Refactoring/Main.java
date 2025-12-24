public class Main {
    public static void main(String[] args) {

        System.out.println("=== VIOLATION DU PRINCIPE DIP (Dependency Inversion Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        OrderProcessor order = new OrderProcessor();

        System.out.println("Traitement d'une commande :");
        order.processOrder("Données à sauvegarder");

        System.out.println();
        System.out.println("PROBLÈME DIP :");
        System.out.println("→ OrderProcessor dépend DIRECTEMENT de MySQLDatabase (classe concrète bas niveau).");
        System.out.println("→ Couplage fort : impossible de changer facilement de base de données.");
        System.out.println("→ Difficile à tester (pas de mock possible facilement).");
        System.out.println("→ Si on veut utiliser MongoDB ou un fichier → il faut modifier OrderProcessor ! ❌");
        System.out.println("→ VIOLATION DU DIP : Les modules haut niveau ne doivent pas dépendre des bas niveau concrets.");
    }
}