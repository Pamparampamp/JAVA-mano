package E01.Uzdavinys3;
//14 skaidres 1 uzdavinys
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Saugykla <E>{

     private List<E> listas = new ArrayList<>();

     public void add(E e) {
         listas.add(e);
     }

     public Iterable<E> asc() {
         return listas;
     }

    public Iterable<E> desc() {
        List<E> li = new ArrayList<>();
        listas.forEach(e -> li.add(0, e));
        return li;
    }
    public Iterable<E> filter(Predicate<E> f) {
        List<E> li = new ArrayList<>();
        listas.forEach(e -> {
            if (f.test(e)) li.add(e);
        });
        return li;
    }
}
