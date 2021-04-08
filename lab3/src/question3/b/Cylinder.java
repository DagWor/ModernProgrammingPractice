package question3.b;

public class Cylinder {
    private double height;
    private Circle circle;

    public Cylinder(double height, Circle circle){
        this.circle = circle;
        this.height = height;
    }

    public double computeVolume(){
        return circle.computeArea() * height;
    }
}
