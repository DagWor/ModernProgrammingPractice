package question3.b;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Cylinder cylinder = new Cylinder(5, circle);

        System.out.println("Area of the circle is : " + circle.computeArea());
        System.out.println("Volume of the cylinder is : " + cylinder.computeVolume());
    }
}
