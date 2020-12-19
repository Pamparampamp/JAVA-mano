package D30;

public class SviesoforasTest {

    public static void main(String[] args) {

//       Sviesoforas  s1 = new Sviesoforas(44,55,new Color(255, 0,0 ) );
//        Sviesoforas  s2 = new Sviesoforas(44,55,new Color(211, 15,15 ) );

        Sviesoforas  s1 = new Sviesoforas(44,55,Color.RED);
        Sviesoforas s2 = new Sviesoforas(44,55,Color.GREEN);
        Sviesoforas s3 = new Sviesoforas(44,55,Color.YELLOW);

        System.out.println(Color.RED);

//        Color.red = Color.yellow;
//        System.out.println(Color.red);

//        class ColorEx extends Color {
//
//            public ColorEx() {
//            }
//        }
        s1.setTipas(Tipas.A);
        s2.setTipas(Tipas.B);
        s3.setTipas(Tipas.C);

//        if ( s3.getTipas().equals(Tipas.C)) {
            if ( s3.getTipas() == Tipas.C) {
            System.out.println("s3  yra tipo C ");

        }
    }
}
