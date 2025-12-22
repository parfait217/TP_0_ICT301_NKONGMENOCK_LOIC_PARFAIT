public class Main {
    public static void main(String[] args) {

        System.out.println("=== VIOLATION DU PRINCIPE OCP (Open/Closed Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        System.out.println("Calcul d'aire :");
        System.out.println("   • Rectangle (5 × 4) → Aire = " + calculator.calculateArea(rectangle));  // 20
        System.out.println("   • Cercle (rayon 3)  → Aire = " + calculator.calculateArea(circle));     // ≈28.27

        System.out.println();
        System.out.println("PROBLÈME : Pour ajouter une nouvelle forme (ex: Triangle),");
        System.out.println("           il faut MODIFIER la classe AreaCalculator (ajouter un nouveau if).");
        System.out.println("→ La classe est FERMÉE À L'EXTENSION mais OUVERTE À LA MODIFICATION ❌");
        System.out.println("→ VIOLATION OCP");
    }
}