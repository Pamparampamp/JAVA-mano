package E01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class LambdaDemo {

    public static void main(String[] args) {


        List<Integer> listas = Arrays.asList(122, 121, 888, 444, 5448);

        for (Integer i : listas) {
            System.out.println(i);
        }

        System.out.println();

        for (Integer i : filtras(listas, i -> i % 2 == 0)) {
            System.out.println(i);
        }
        System.out.println();

        for (Integer i : filtras(listas, i -> i % 2 != 0)) {
            System.out.println(i);
        }
        System.out.println();
        listas.stream().filter(x -> x < 100 ).forEach(System.out::println);
    }

    static Iterable<Integer> filtras(List<Integer> list, Function<Integer, Boolean> f) {

        return new Iterable<Integer>() {

            public Iterator<Integer> iterator() {

                List<Integer> lyginai = new ArrayList<>();
                for (Integer i : list){
                    if (f.apply(i)) lyginai.add(i);
                }

                return lyginai.iterator();
            }

        };

    }

}