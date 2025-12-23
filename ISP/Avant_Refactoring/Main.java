public class Main {
    public static void main(String[] args) {

        System.out.println("=== VIOLATION DU PRINCIPE ISP (Interface Segregation Principle) ===");
        System.out.println("=== Par NKONGMENOCK LOIC PARFAIT - 23U2241 ===");
        System.out.println();

        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        System.out.println("1. Test avec un HumanWorker :");
        System.out.println("   → Appel work()");
        human.work();
        System.out.println("   → Appel eat()");
        human.eat();
        System.out.println("   → Tout est normal ✅");
        System.out.println();

        System.out.println("2. Test avec un RobotWorker :");
        System.out.println("   → Appel work()");
        robot.work();  // OK
        System.out.println("   → Appel eat()");
        try {
            robot.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println("   !!! Exception : " + e.getMessage());
        }
        System.out.println();

        System.out.println("PROBLÈME ISP :");
        System.out.println("→ L'interface Worker est trop grosse (fat interface).");
        System.out.println("→ RobotWorker est forcé d'implémenter eat() qu'il n'utilise jamais.");
        System.out.println("→ Résultat : code pollué, exceptions inutiles, maintenance difficile ❌");
        System.out.println("→ VIOLATION DU PRINCIPE ISP");
    }
}