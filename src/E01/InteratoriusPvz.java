package E01;

import java.util.*;

public class InteratoriusPvz {

    public static void main(String[] args) {

        Collection<String> listas = new TreeSet<>();
        listas.add("Kaunas");
        listas.add("Vilnius");
        listas.add("Klaipeda");
        listas.add("Panevezys");

        System.out.println();
        for (String s : listas) {
            System.out.println(s);
        }
        // tas pats kas cia for ciklas ir while ciklas
        System.out.println();
                Iterator <String> it = listas.iterator();
                while (it.hasNext()){
                    String s = it.next();
                    System.out.println(s);
                }
        Trys trys = new Trys(10,11,5);
        System.out.println();
        Iterator <Integer> it3 = trys.iterator();
        while (it3.hasNext()) {
            Integer i = it3.next();
            System.out.println(i);
        }
        System.out.println();
        for (Integer i : trys) {
            System.out.println(i);
        }
    }

}
    class Trys implements Iterable<Integer> {

  final private Integer  a, b , c ;

        public Trys(Integer a, Integer b, Integer c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public Iterator<Integer> iterator() {
//            class TrysIt implements Iterator<Integer>{
//
//                @Override
//                public boolean hasNext() {
//                    return false;
//                }
//
//                @Override
//                public Integer next() {
//                    return null;
//                }
//            }
            //SUSIKURIAM ANONIMINE KLASE viskas tas pats kas klase tik be jos pavadinimo be galvos
            return new Iterator<Integer>() {
                private int i ;     // 0 , 1 , 2 , 3

                @Override
                public boolean hasNext() {
                    return i < 3;  // 0 , 1, 2, jei 3 jau false
                }

                @Override
                public Integer next() {
                    if (i == 0) {
                        i++;
                        return a;

                    } else if (i == 1) {
                        i++;
                        return b;
                    } else if (i == 2) {
                        i++;
                        return c;
                    }

                    throw new RuntimeException("Nera tokio elemento: " + i)  ;
                }
            };
        }
    }

