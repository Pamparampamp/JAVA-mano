package E02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(2,"ARF"),
                new Employee(1,"VAS"),
                new Employee(3,"ARF"),
                new Employee(5,"ARA"),
                new Employee(4,"VAS"),
                new Employee(6,"VAS"),
                new Employee(7,"DFV")
        );
        //kiek yra darbuotoju skirtingu vardu
         // Employee -> name -> name(String) -> distinct() -> peek -> count()

          long cnt = employees.stream()
                      .map(e -> e.getName())
                      .peek(e -> System.out.println("1: " + e))
                      .distinct()
                      .peek(e -> System.out.println("2: " + e))
                      .count();
        System.out.println("Viso= " +   cnt);

        // tas pats sprendimas tik per set  isrusiuoja vienuodus vardus. Suzinome kiek yra skirtingu vardu nesikartojanciu
//            cnt = employees.stream()
//                    .map(e -> e.getName())
//                    .collect(Collectors.toSet())
//                    .size();


//        Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8).stream() ...
       int total = IntStream.range(1 , 11)   //susumuoja nuo 1 iki 101   atsakymas 5050
               .filter(x -> x % 2 == 0)        // susumuoja tik lyginius    2550
               .sum();
        System.out.println("1+...+10 = "+ total);

//reduce operacija sumuoja tik lyginius skaicius
         total =  Stream.of( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                 .filter(x -> x % 2 == 0)
                .reduce(0, (x, y) -> {
                            System.out.println("reduce: " + x + "+" + y + "=" + (x + y));
                            return x + y ;
            });

        System.out.println("1+...+10  = "+ total);


        //UZDAVINYS: Atspausdinti varda ir kiek darbuotoju yra su tuo paciu vardu
        // // Employee -> groupBy Employee.name: Map<String, List<Employee>>
        // Su map.keySet operacija      collecting operacija gaunaant map su map daug ka galima padaryt

        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getName()));
            map.keySet().forEach(e -> {
                System.out.println("SU VARDU : " + e + " YRA DARBUOTOJU " + map.get(e).size());
            });


            // su entrySet operacija
        employees.stream()
                .collect(Collectors.groupingBy(e -> e.getName()))
                .entrySet()
                .forEach(e -> {
                    System.out.println("Su vardu:  " + e.getKey() +  " yra " + e.getValue().size());
                });

    }


}
