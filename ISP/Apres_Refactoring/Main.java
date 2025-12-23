public class Main {
    public static void main(String[] args) {

        System.out.println("=== RESPECT DU PRINCIPE ISP (Interface Segregation Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        System.out.println("1. Test avec un HumanWorker (implémente Eatable) :");
        System.out.println("   → Appel work()");
        human.work();
        System.out.println("   → Appel eat()");
        human.eat();
        System.out.println("   → Comportement complet et cohérent ✅");
        System.out.println();

        System.out.println("2. Test avec un RobotWorker (implémente seulement Workable) :");
        System.out.println("   → Appel work()");
        robot.work();
        System.out.println("   → Pas de méthode eat() forcée → aucune exception ! ✅");
        System.out.println();

        System.out.println("SOLUTION ISP APPLIQUÉE :");
        System.out.println("→ Interfaces petites et spécialisées (Workable et Eatable).");
        System.out.println("→ Chaque classe implémente SEULEMENT ce dont elle a besoin.");
        System.out.println("→ Plus de méthodes vides ou exceptions inutiles.");
        System.out.println("→ Code propre, maintenable et extensible ✔️");
        System.out.println("→ PRINCIPE ISP RESPECTÉ");
    }
}