package question3.a;

public class Circle extends Cylinder{
    private double radius;

    public Circle(double radius){
        // Hardcode data to avoid errors
        super(5, radius);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
