public class BookBusinessLogic {

    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("Emprunt du livre \"" + book.getTitle() + "\" par " + lecteur);
    }

    // On peut ajouter d'autres règles métier
    public void retourner(BookSRP book) {
        System.out.println("Retour du livre \"" + book.getTitle() + "\"");
    }
}