public class Main {
    public static void main(String[] args) {
        System.out.println("=== Application de gestion de livres avec SRP  ===");
        System.out.println("=== By NKONGMENOCK LOIC PARFAIT 23U2241  ===");

        Book book = new Book("Les principes SOLID", "Etudiants de M-GL", "Révision des principes SOLID");

        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}