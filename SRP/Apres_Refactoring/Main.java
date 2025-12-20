public class Main {
    public static void main(String[] args) {

        System.out.println("=== Application de gestion de livres avec SRP  ===");
        System.out.println("=== By NKONGMENOCK LOIC PARFAIT 23U2241  ===");

        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M-GL", "Révision des principes SOLID");

        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic logic = new BookBusinessLogic();

        printer.printToScreen(book);
        saver.saveToDatabase(book);
        logic.emprunter(book, "Marcial");
    }
}