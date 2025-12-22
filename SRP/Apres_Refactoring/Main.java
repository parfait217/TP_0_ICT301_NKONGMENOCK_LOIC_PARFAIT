public class Main {
    public static void main(String[] args) {

        System.out.println("=== RESPECT DU PRINCIPE SRP (Single Responsibility Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        BookSRP book = new BookSRP("Les principes SOLID", "Étudiants M-GL", "Révision complète des 5 principes");

        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic logic = new BookBusinessLogic();

        System.out.println("1. Affichage à l'écran → responsabilité unique :");
        printer.printToScreen(book);
        System.out.println();

        System.out.println("2. Sauvegarde → responsabilité unique :");
        saver.saveToDatabase(book);
        System.out.println();

        System.out.println("3. Logique métier (emprunt) → responsabilité unique :");
        logic.emprunter(book, "Marcial");
        System.out.println();

        System.out.println("SOLUTION : 4 classes séparées, chacune avec UNE SEULE responsabilité");
        System.out.println("→ Facile à maintenir, tester, modifier");
        System.out.println("→ PRINCIPE SRP RESPECTÉ ");
    }
}