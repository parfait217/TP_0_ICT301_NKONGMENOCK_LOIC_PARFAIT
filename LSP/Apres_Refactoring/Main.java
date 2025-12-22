public class Main {
    public static void main(String[] args) {

        System.out.println("=== RESPECT DU PRINCIPE LSP (Liskov Substitution Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        // =============================================
        // Création des formes via l'interface Shape
        // =============================================
        Shape rectangle = new Rectangle(5, 4);  // Rectangle 5 × 4
        Shape square    = new Square(5);        // Carré de côté 5

        // =============================================
        // Affichage des résultats
        // =============================================
        System.out.println("1. Rectangle (via interface Shape) :");
        System.out.println("   - Largeur : 5");
        System.out.println("   - Hauteur : 4");
        System.out.println("   - Aire calculée : " + rectangle.getArea());  // 20
        System.out.println("   → Comportement attendu conservé : 5 × 4 = 20 ");
        System.out.println();

        System.out.println("2. Carré (via interface Shape) :");
        System.out.println("   - Côté : 5");
        System.out.println("   - Aire calculée : " + square.getArea());     // 25
        System.out.println("   → Comportement attendu conservé : 5 × 5 = 25 ");
        System.out.println();

        System.out.println("Conclusion :");
        System.out.println("→ Rectangle et Carré implémentent tous les deux l'interface Shape.");
        System.out.println("→ Aucun ne modifie le comportement de l'autre.");
        System.out.println("→ On peut substituer n'importe quelle implémentation de Shape sans surprise.");
        System.out.println("→ PRINCIPE LSP RESPECTÉ ✔️");
        System.out.println();

        System.out.println("Solution appliquée : Plus d'héritage forcé entre Rectangle et Square.");
        System.out.println("                   Utilisation d'une interface commune pour la substitution sûre.");
    }
}