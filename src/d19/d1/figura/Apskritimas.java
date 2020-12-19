package d19.d1.figura;

public class Apskritimas  extends figura{

    private double r;

    public Apskritimas(double x, double y,  double r) {
        super(x, y, 0);
        this.r = r;
    }

    @Override
    public double plotas() {
        return Math.PI * r * r;
    }

    @Override
    public double perimetras() {
        return 2 * Math.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
