package Module_Introduction;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(0);
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(1.5);
        System.out.printf("Area of circle: %.1f%n", circle.getArea());
        System.out.printf("Area of circle: %.1f%n", circle2.getArea());
        System.out.printf("Area of circle: %.1f%n", circle3.getArea()); // the %.1f%n formats the output to 1 dp
    }


    
}
