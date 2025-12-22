public class Main {
    public static void main(String[] args) {

        System.out.println("=== RESPECT DU PRINCIPE OCP (Open/Closed Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        AreaCalculator calculator = new AreaCalculator();

        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        System.out.println("Calcul d'aire via polymorphisme :");
        System.out.println("   • Rectangle (5 × 4) → Aire = " + calculator.calculateArea(rectangle));  // 20
        System.out.println("   • Cercle (rayon 3)  → Aire = " + calculator.calculateArea(circle));     // ≈28.27

        System.out.println();
        System.out.println("AVANTAGE : Pour ajouter une nouvelle forme (ex: Triangle),");
        System.out.println("           on crée juste une nouvelle classe implémentant Shape.");
        System.out.println("           → PAS BESOIN de modifier AreaCalculator !");
        System.out.println("→ OUVERTE À L'EXTENSION, FERMÉE À LA MODIFICATION ✔️");
        System.out.println("→ PRINCIPE OCP RESPECTÉ");
    }
}