package d19.d1.figura;

public class Staciakampis  extends  figura{

private double a;
private double b;

    public Staciakampis(double x, double y, double laipsnis, double a, double b) {
        super(x, y, laipsnis);
        this.a = a;
        this.b = b;
    }

    @Override
    public double plotas() {
//        return super.plotas();
        return a * b;
    }

    @Override
    public double perimetras() {
//        return super.perimetras();
        return 2 * ( a + b );
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
