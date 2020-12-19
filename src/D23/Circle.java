package D23;

public class Circle extends Figura {

    private double r;

    public Circle(Point center,  double r) {
        super(center,0);
        this.r = r;
    }

    @Override
    public double getArea() {
        return  Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * 2;
    }
}
