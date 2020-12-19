package E02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Optional<I extends Number> {

    public static void main(String[] args) {

        List<Integer> listas = Arrays.asList( 40 , null , 10 , 11 , 5);

        java.util.Optional<Integer> i = rastiPirma(listas, a -> a != null && a < 10 && a > 0 );
        System.out.println(i);
// jei optional reiksme is masyvo ir pns  value = null.  grazina Optional.empty reiksme
       i = rastiPirma(listas, a -> a != null && a > 100 );
        System.out.println(i);
    }
        static java.util.Optional<Integer> rastiPirma(List<Integer> listas , Predicate<Integer> f) {

        for (Integer i : listas) {
            if (f.test(i)) return java.util.Optional.of(i);

        }
            return java.util.Optional.empty();
    }



}
