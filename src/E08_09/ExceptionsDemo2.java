package E08_09;

public class ExceptionsDemo2 {

    public static void main(String[] args) {

        test(new int[] {-3, 2 , 4, 5});
        test(new int[] {4});
        test(new int[] {});
        test(null);
    }

    static  void test(int[] masyvas) {
        try {
            System.out.println("Max reiksme = " + MathMano.max(masyvas));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MathMano {
    static int max(int[] masyvas) {
        try {
            //       if (masyvas.length == 0) throw new TusciasMasyvas();
            int x = masyvas[0];
            for (int i = 1; i < masyvas.length; i++) {
                if (x < masyvas[i]) {
                    x = masyvas[i];
                }
            }
            return x;
        } catch (NullPointerException e) {
            throw new NeteisingiDuomenys(e);
        } catch (Exception e) {
            throw new SkaiciavimoKlaida(e);
        }
    }
}

//class  TusciasMasyvas extends RuntimeException {
//
//
//}

class ManoKlaida extends RuntimeException {

    public ManoKlaida(Throwable cause) {
        super(cause);
    }
}


class NeteisingiDuomenys extends ManoKlaida {
    public NeteisingiDuomenys(Throwable cause) {
        super(cause);
    }
}
class SkaiciavimoKlaida extends ManoKlaida {
    public SkaiciavimoKlaida(Throwable cause) {
        super(cause);
    }
}
