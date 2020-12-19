package D23;

public abstract class Figura implements IArea, IPerimeter {

    private Point center;
    private double rotate;


    public Figura(Point center, double rotate) {
        this.center = center;
        this.rotate = rotate;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRotate() {
        return rotate;
    }

    public void setRotate(double rotate) {
        this.rotate = rotate;
    }
}
