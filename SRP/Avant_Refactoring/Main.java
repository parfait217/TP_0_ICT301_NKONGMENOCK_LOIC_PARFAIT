public class Main {
    public static void main(String[] args) {

        System.out.println("=== VIOLATION DU PRINCIPE SRP (Single Responsibility Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        Book book = new Book("Les principes SOLID", "Étudiants M-GL", "Révision complète des 5 principes");

        System.out.println("1. Affichage à l'écran (présentation) :");
        book.printToScreen();
        System.out.println();

        System.out.println("2. Sauvegarde en base de données (persistance) :");
        book.saveToDatabase();
        System.out.println();

        System.out.println("3. Emprunt du livre (logique métier) :");
        book.emprunter("Marcial");
        System.out.println();

        System.out.println("PROBLÈME : La classe Book fait TROIS choses différentes :");
        System.out.println("   • Gérer les données");
        System.out.println("   • Afficher");
        System.out.println("   • Sauvegarder");
        System.out.println("   • Gérer la logique métier");
        System.out.println("→ VIOLATION SRP : Une classe = plusieurs responsabilités → difficile à maintenir ❌");
    }
}