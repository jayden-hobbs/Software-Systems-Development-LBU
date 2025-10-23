package Module_Introduction;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(4.0, 2.0);
        Rectangle rect3 = new Rectangle(6.0, 1.5);
        System.out.println("Area of rectangle: " + rect.getArea());
        System.out.println("Area of rectangle: " + rect2.getArea());
        System.out.println("Area of rectangle: " + rect3.getArea());
    }
}
