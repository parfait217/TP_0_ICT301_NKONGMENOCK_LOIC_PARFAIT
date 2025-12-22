public class Main {
    public static void main(String[] args) {

        System.out.println("=== VIOLATION DU PRINCIPE LSP (Liskov Substitution Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        // =============================================
        // 1. Test avec un Rectangle normal → Comportement attendu
        // =============================================
        System.out.println("1. Test avec un Rectangle normal :");
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);

        System.out.println("   - Largeur définie  : 5");
        System.out.println("   - Hauteur définie  : 4");
        System.out.println("   - Aire calculée    : " + rectangle.getArea());  // 20
        System.out.println("   → Résultat attendu : 5 × 4 = 20 → CORRECT ");
        System.out.println();

        // =============================================
        // 2. Test avec un Square traité comme un Rectangle → PROBLÈME LSP !
        // =============================================
        System.out.println("2. Test avec un Carré (substitué à Rectangle) :");
        Rectangle squareAsRect = new Square();  // Polymorphisme : on attend un comportement de Rectangle
        squareAsRect.setWidth(5);   // On veut une largeur de 5
        squareAsRect.setHeight(4);  // On veut une hauteur de 4 → mais le Square force l'égalité !

        System.out.println("   - Appel : setWidth(5)");
        System.out.println("   - Appel : setHeight(4)");
        System.out.println("   - Aire calculée    : " + squareAsRect.getArea());  // 16 au lieu de 20 !

        System.out.println("   → Résultat inattendu : 4 × 4 = 16 au lieu de 5 × 4 = 20");
        System.out.println("   → VIOLATION LSP : Le sous-type (Square) casse le comportement attendu du type parent (Rectangle) ❌");
        System.out.println();

        System.out.println("Conclusion : Un Carré ne peut pas hériter de Rectangle sans violer le LSP.");
        System.out.println("Solution : Utiliser une interface commune (Shape) sans relation d'héritage forcée.");
    }
}