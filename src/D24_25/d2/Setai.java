package D24_25.d2;

import D24_25.Meteo;
import com.sun.source.tree.Tree;

import java.time.LocalDateTime;
import java.util.*;


public class Setai {

    public static void main(String[] args) {

        Meteo m1 = new Meteo();
        m1.setKrituliai(5);
        m1.setVejoKryptis(15);
        m1.setVejoStiprumas(7);

        Meteo m2 = m1;



        Meteo m3 = new Meteo();
        m3.setKrituliai(5);
        m3.setVejoKryptis(15);
        m3.setVejoStiprumas(7);

        Meteo m4 = new Meteo();
        m4.setKrituliai(4);
        m4.setVejoKryptis(13);
        m4.setVejoStiprumas(2);

        Set<Meteo> meteos = new TreeSet<>();
//        meteo.add(meteo);
//        meteo.add(m2);

        System.out.println(meteos.add(m1));
        System.out.println(meteos.add(m2));
        System.out.println(meteos.add(m3));
        System.out.println(meteos.add(m4));
        System.out.println(meteos.size());

        String x;

//        Collection<String> text = new TreeSet<>();
//        text.add("xxx");
//        text.add("AAA");
//        text.add("BBB");
//        text.add("EEEE");
//        System.out.println(text);
    }


}
