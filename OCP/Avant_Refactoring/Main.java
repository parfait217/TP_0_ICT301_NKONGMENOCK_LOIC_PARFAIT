public class Main {
    public static void main(String[] args) {

        System.out.println("=== sans refactoring avec OCP  ===");
        System.out.println("=== By NKONGMENOCK LOIC PARFAIT 23U2241  ===");

        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        System.out.println("Aire du rectangle : " + calculator.calculateArea(rectangle));
        System.out.println("Aire du cercle : " + calculator.calculateArea(circle));
    }
}