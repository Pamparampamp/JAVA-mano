package d19.d1.figura;

public class FiguraTest {

    public static  void main(String[] args) {
//        figura f1 = new figura(1,5,5);  // abstakti klase
        Apskritimas  A1 = new Apskritimas(0,0,10);
        Apskritimas  A2 = new Apskritimas(10,15,10);
        Staciakampis s1 = new Staciakampis(30,30,45,10,20);
        Kvadratas k1 = new Kvadratas(50,50,180,10);

        figura [] figuros = { A1, A2, s1, k1 };
        System.out.println("Bendras plotas=" + bendrasPlotas(figuros));
        System.out.println("Bendras plotas=" + bendrasPerimetras(figuros));
    }

    private static double bendrasPerimetras(figura[] figuros) {
        double perimetras = 0;
        for (figura f: figuros ){
            perimetras += f.perimetras();
        }
        return perimetras;
    }

    private static double bendrasPlotas(figura[] figuros) {
        double plotas = 0;
        for (figura f: figuros ){
            plotas += f.plotas();
        }
        return plotas;
    }
}
