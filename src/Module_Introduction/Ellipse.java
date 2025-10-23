package Module_Introduction;

public class Ellipse extends Rectangle {
    private double width;
    private double height;

    public Ellipse(double width, double height) {
        super(width, height);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        double width = this.width / 2.0;
        double height = this.height / 2.0;
        return Math.PI * width * height;
    }
    @Override
    public String toString() {
        return String.format(
            "Ellipse with width %.1f and height %.1f has area %.1f",
            width, height, getArea()
    );
}


    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(5.0, 3.0);
        Ellipse ellipse2 = new Ellipse(4.0, 2.0);
        Ellipse ellipse3 = new Ellipse(6.0, 1.5);
        System.out.println(ellipse.toString());
        System.out.println(ellipse2.toString());
        System.out.println(ellipse3.toString());
    }
}

    


