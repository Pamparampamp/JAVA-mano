package d19.d1.figura;

public abstract class figura {

    private double x;
    private double y;
    private double laipsnis;

    public figura(double x, double y, double laipsnis) {
        this.x = x;
        this.y = y;
        this.laipsnis = laipsnis;
    }

    public figura() {

    }

    public abstract double plotas ();
    public abstract double perimetras ();


//    public double plotas (){
//        return 0;
//
//    }
//
//   public    double perimetras (){
//        return 0;
//
//    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getLaipsnis() {
        return laipsnis;
    }

    public void setLaipsnis(double laipsnis) {
        this.laipsnis = laipsnis;
    }
}
