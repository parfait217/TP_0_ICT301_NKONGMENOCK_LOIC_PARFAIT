// Classe Rectangle
class Rectangle {
    private final  double width;
    private final  double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

// Classe Circle
class Circle {
    private final  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class AreaCalculator {
    public double calculateArea(Object shape) {
        return switch (shape) {
            case Rectangle rectangle -> rectangle.getWidth() * rectangle.getHeight();
            
            case Circle circle -> Math.PI * circle.getRadius() * circle.getRadius();
            
            case null, default -> throw new IllegalArgumentException("Unknown shape");
        };
    }
}