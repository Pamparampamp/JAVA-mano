package D30;

public class Sviesoforas {

   private double      lat;
   private double      lng;
    private Color color;
    private Tipas tipas;

    public Sviesoforas(double lat, double lng, Color color) {
        this.lat = lat;
        this.lng = lng;
        this.color = color;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Tipas getTipas() {
        return tipas;
    }

    public void setTipas(Tipas tipas) {
        this.tipas = tipas;
    }
}
//    final class Color {
//        private int  r , g , b;
//
//      final   static   public  Color RED  = new Color(255,0,0);
//       final static  public  Color GREEN  = new Color(0,255,0);
//       final static  public  Color YELLOW  = new Color(255,255,0);
//        final static  public  Color NONE  = new Color(0,0,0);
//     private Color(int r, int g, int b) {
//
//            //TODO tikrinti spalvas
//            this.r = r;
//            this.g = g;
//            this.b = b;
//        }
//
//        public int getR() {
//            return r;
//        }
//
//
//        public int getG() {
//            return g;
//        }
//
//
//        public int getB() {
//            return b;
//        }
//
//        @Override
//        public String toString() {
//            return "Color{" +
//                    "r=" + r +
//                    ", g=" + g +
//                    ", b=" + b +
//                    '}';
//        }
//    }

//   final class Tipas {
//
//         public static final Tipas A = new Tipas();
//       public static final Tipas B =  new Tipas();
//       public static final Tipas C =  new Tipas();
//
//    private Tipas(){
//
//    }

        enum Color {
            RED(255,0,0),
            GREEN(0,255,0),
            YELLOW(255,255,0),
            NONE(0,0,0);
           final   private int  r , g , b;

            Color(int r, int g, int b) {
                this.r = r;
                this.g = g;
                this.b = b;
            }

            @Override
            public String toString() {
                return this.name() +  "(" +
                        "r=" + r +
                        ", g=" + g +
                        ", b=" + b +
                        ')';
            }
        }


        enum Tipas {
            A, B, C, X
        }
