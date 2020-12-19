package D26;

import java.util.ArrayList;
import java.util.List;

public class MusuVeiksmoDemo {

    public static void main(String[] args) {
        new MusuVeiksmoDemo().run();

    }

    void run() {
        List<Integer> skaiciukai = new ArrayList<>();
        skaiciukai.add(100);
        skaiciukai.add(200);
        skaiciukai.add(300);
        skaiciukai.add(400);
        System.out.println(skaiciukai);
        List<Integer> r1 = daugyba(skaiciukai, 2);
        System.out.println(r1);

        List<Integer> r2 = dalyba(skaiciukai, 2);
        System.out.println(r2);


        class ManoVeiksmas implements IManoVeiksmas {

            @Override
            public int veiksmas(int i) {
                return i + 222;
            }
        }
        System.out.println(manoVeiksmas(skaiciukai, new ManoVeiksmas()));

        class ManoVeiksmas2 implements IManoVeiksmas {

            @Override
            public int veiksmas(int i) {
                return i - 22;
            }
        }

        IManoVeiksmas veiksmas2 = new ManoVeiksmas2();
        System.out.println(manoVeiksmas(skaiciukai, veiksmas2));


        IManoVeiksmas veiksmas3 = new IManoVeiksmas() {

            @Override
            public int veiksmas(int i) {
                return i * 3;
            }
        };
        System.out.println(manoVeiksmas(skaiciukai, veiksmas3));

        System.out.println(manoVeiksmas(skaiciukai, x -> x * 5));

    }


    interface IManoVeiksmas {
        int veiksmas(int i);
    }

    List<Integer> manoVeiksmas(List<Integer> src, IManoVeiksmas v) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : src) {
            res.add(v.veiksmas(i));
        }
        return res;
    }


    List<Integer> daugyba(List<Integer> src, int c) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : src) {
            res.add(i * c);
        }
        return res;

    }

    List<Integer> dalyba(List<Integer> src, int c) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : src) {
            res.add(i / c);
        }
        return res;

    }
}
