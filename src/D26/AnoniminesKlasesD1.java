package D26;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnoniminesKlasesD1 {

    public static void main(String[] args) {
        List<Mokinys> mokiniai = new ArrayList<>();
        mokiniai.add(new Mokinys(1001, "G1", "P1", LocalDate.of(2000, 1, 1), 8));
        mokiniai.add(new Mokinys(1002, "F2", "P2", LocalDate.of(2001, 4, 2), 6));
        mokiniai.add(new Mokinys(1003, "B3", "P3", LocalDate.of(2002, 5, 3), 5));
        mokiniai.add(new Mokinys(1004, "D4", "P4", LocalDate.of(2003, 6, 4), 7.6));
        mokiniai.add(new Mokinys(1005, "C5", "P5", LocalDate.of(2004, 7, 5), 9.6));
        mokiniai.add(new Mokinys(1006, "A6", "P6", LocalDate.of(2005, 8, 6), 5));

//        mokiniai.forEach(m -> System.out.println(m.getFirstName()));

        for (Mokinys m : mokiniai){
            System.out.println(m.getFirstName());

        }
//        class MokiniuComparatorius implements Comparator<Mokinys> {
//
//            @Override
//            public int compare(Mokinys o1, Mokinys o2) {
//                System.out.println("---> compare");
//                return o1.getFirstName().compareTo(o2.getFirstName());
//            }
//        }
//
//        Comparator<Mokinys> comparator = new MokiniuComparatorius();
//
        mokiniai.sort(new  Comparator<Mokinys>(){


            @Override
            public int compare(Mokinys o1, Mokinys o2) {
              return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });


        System.out.println();
        mokiniai.forEach(m -> System.out.println(m.getFirstName()));
    }

}

