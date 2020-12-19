package D24_25.d2;

import D24_25.Meteo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listai {

    public static void main(String[] args) {

        List  <Meteo> meteos = new ArrayList();
        Meteo meteo = new Meteo();
        meteo.setKrituliai(5);
        meteo.setVejoKryptis(15);
        meteo.setVejoStiprumas(7);

        meteos.add(meteo);
        meteos.add(meteo);
        meteos.addAll(Arrays.asList( meteo , meteo , meteo ));
//        meteos.add(new Meteo[ ] { meteo , meteo , meteo });
//        meteos.add(123);
        System.out.println(meteos.size());
        Meteo m = (Meteo) meteos.get(1);
        System.out.println(m.getKrituliai() + "mm ");


        for (Meteo e : meteos) {
            if (e == null) continue;
            System.out.println(e.getKrituliai() + "mm " +
           e.getVejoKryptis() + " ");
        }
//        BigInteger bi = BigInteger.valueOf(1);
//        bi = bi.add(BigInteger.ONE);
//        System.out.println(bi);

    }




}
