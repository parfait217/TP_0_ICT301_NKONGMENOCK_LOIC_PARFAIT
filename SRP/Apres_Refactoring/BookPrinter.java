public class BookPrinter {

    // Affichage console simple
    public void printToScreen(BookSRP book) {
        System.out.println("===Print to Screen===");
        System.out.println("Titre : " + book.getTitle());
        System.out.println("Auteur : " + book.getAuthor());
        System.out.println("Contenu : " + book.getContent());
    }

    // On peut ajouter d'autres formats sans toucher aux autres classes
    public void printToHTML(BookSRP book) {
        System.out.println("<html>");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Par " + book.getAuthor() + "</h2>");
        System.out.println("<p>" + book.getContent() + "</p>");
        System.out.println("</html>");
    }
}