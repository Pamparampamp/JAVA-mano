package E01.Uzdavinys1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// 13 skaidres uzdavinys

public class Main {

    public static void main(String[] args) {

        List<Automobilis> automobiliai = new ArrayList<>();
        automobiliai.add(new Automobilis("BMW", "AAA001", new Savininkas("Algirdas ","Jonaitis")));
        automobiliai.add(new Automobilis("BMW", "VSD021", new Savininkas("Sigitas ","Naujalis")));
        automobiliai.add(new Automobilis("Mercedes", "AOT113", new Savininkas("Antanas ","Pranckus")));
        automobiliai.add(new Automobilis("TOYOTA", "FAS012", new Savininkas("Antanas ","Pranckus")));
        automobiliai.add(new Automobilis("Volswagen", "LKD231", new Savininkas("Pranas ","Augustinavicius")));
        automobiliai.add(new Automobilis("Mazda", "SSA331", new Savininkas("Joana ","Germante")));
        automobiliai.add(new Automobilis("Jaguar", "GGE233", new Savininkas("Arnoldas ","Pranka")));
        automobiliai.add(new Automobilis("Audi", "DSS245", new Savininkas("Agne ","Langaite")));

//        automobiliai.sort(new Comparator<Automobilis>() {
//            @Override
//            public int compare(Automobilis o1, Automobilis o2) {
//               int cmp = o1.getSavininkas().getPavarde().compareTo(o2.getSavininkas().getPavarde());
//               if (cmp != 0 ) return cmp;
//
//                cmp = o1.getSavininkas().getVardas().compareTo(o2.getSavininkas().getVardas());
//                if (cmp != 0 ) return cmp;
//
//                return  o1.getNumeris().compareTo(o1.getNumeris());
//
//            }
//        });

        // supraprastintas metodas
        automobiliai.sort(( o1,  o2) -> {
                int cmp = o1.getSavininkas().getPavarde().compareTo(o2.getSavininkas().getPavarde());
                if (cmp != 0 ) return cmp;

                cmp = o1.getSavininkas().getVardas().compareTo(o2.getSavininkas().getVardas());
                if (cmp != 0 ) return cmp;

                return  o1.getNumeris().compareTo(o1.getNumeris());
        });

        automobiliai.forEach(a -> System.out.println(a.getSavininkas().getPavarde() + " " +
        a.getSavininkas().getVardas() + " " +
        a.getNumeris() + " " +
        a.getMarke() + " "));



    }

}

