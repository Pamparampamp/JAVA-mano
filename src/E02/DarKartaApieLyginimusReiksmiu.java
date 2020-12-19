package E02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DarKartaApieLyginimusReiksmiu {

    public static void main(String[] args) {

        ManoKlase m1 = new ManoKlase("A");
        ManoKlase m2 = new ManoKlase("A");

        System.out.println(m1.equals(m2) ? "m1 == m2" : "m1 != m2");

        ManoKlaseEx x1 = new ManoKlaseEx("A");
        ManoKlaseEx x2 = new ManoKlaseEx("A");
        System.out.println(x1 instanceof ManoKlase);
        System.out.println(x1.equals(x2) ? "x1 == x2" : "x1 != x2");

        ManoKlase m3 = x1;

        Set<ManoKlase> setas = new HashSet<>();
        setas.add(m1);  // sete yra 3 elementai : m1 ir m2 ; m3 ; ir x1 ir x2.   kaip masyve
        setas.add(m2);
        setas.add(m3);
        setas.add(x1);  // nesudeda x1 ir x2 nes tokie patys laukai nors ir skiriasi klases. kadangi m3 yra tos pacios klases reiksme x1
        setas.add(x2);

        System.out.println("setas dydis: " + setas.size());


    }
}

    class ManoKlase {
        private String laukas11;

        public ManoKlase(String laukas11) {
            this.laukas11 = laukas11;
        }

        @Override
        public String toString() {
            return "ManoKlase{" +
                    "laukas11='" + laukas11 + '\'' +
                    '}';
        }

        public String getLaukas11() {
            return laukas11;
        }

        public void setLaukas11(String laukas11) {
            this.laukas11 = laukas11;
        }


    }

    class ManoKlaseEx extends ManoKlase {
        public  ManoKlaseEx(String laukas11) {
            super(laukas11);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ManoKlase manoKlase = (ManoKlase) o;
            return Objects.equals(getLaukas11(), manoKlase.getLaukas11());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getLaukas11());
        }
    }
