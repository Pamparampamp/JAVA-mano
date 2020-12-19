package D23;

public  class Disaster implements IArea {


    private Point startPoint;
    private double direction;
    private double speed;
    private double area;

    public Disaster(Point startPoint, double direction, double speed, double area) {
        this.startPoint = startPoint;
        this.direction = direction;
        this.speed = speed;
        this.area = area;
    }



    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
