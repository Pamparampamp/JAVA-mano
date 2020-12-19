package E02;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsStreamDemo {


    public static void main(String[] args) {

        List<Integer> listas = Arrays.asList(-11, 12 , 12, -15, -22, 28, 65, 100);


        listas.stream()  //konvejerio paleidimas  for each operacija galine  1 pvz
                .filter(x -> x >= 0 )   //tarpines operacijos
                .filter(x -> x < 100 )  // ...
                .map(e -> e * 10 )
                .sorted(( a, b ) -> -Integer.compare( a , b ))
                .skip(1)
       .forEach(i -> System.out.println(i));   // konvejerio uzdarymo operacija

// count operacija galine 2pvz
        long count = listas.stream()  //konvejerio paleidimas
                .filter(x -> x >= 0 )   //tarpines operacijos
                .filter(x -> x < 100 )  // ...
                .map(e -> e * 10 )
                .sorted(( a, b ) -> -Integer.compare( a , b ))
                .skip(1)
                .count();   //galine operacija
        System.out.println("count = "+ count);

        Set<Integer> naujasListas = listas.stream()  //konvejerio paleidimas  galine operacija collect  3 pvz
                        .filter(x -> x >= 0 )   //tarpines operacijos
                        .filter(x -> x < 100 )  // ...
                        .map(e -> e * 10 )
                        .sorted(( a, b ) -> -Integer.compare( a , b ))
                        .skip(1)
                        .collect(Collectors.toSet());
        System.out.println("naujasListas = "+ naujasListas);   //setas dieju vienodos reiksmes elementu nespausdina

        /*  Sekantis pvz listas ******* listu  */

        List<List<Integer>> listas2 =Arrays.asList(
                Arrays.asList(-11, 12 , 12, -15),
                Arrays.asList(-22, 28, 65, 100));

        naujasListas = listas2.stream()
                .flatMap(e -> e.stream())
                .map(e -> e * 100 )
                .collect(Collectors.toSet());
        System.out.println("naujasListas2 = "+ naujasListas);
    }




}
