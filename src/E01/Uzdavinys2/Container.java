package E01.Uzdavinys2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Container <E> {

//    static double a = skaitytiIsFailo();
//    static {
//        if (Math.random() < 0.5) a = 400;
//        if (Math.random() < 0.5) a *= 2;
//    try {
//       a = skaitytiIsFailo();
//    } catch (Exception e) {
//        a = 0;
//    }
//    }

   // 1) budas
     List<E> list = new ArrayList<>();
    //2) budas
//     List<E> list;
//    public Container(List<E> list) {
//        this.list =  new ArrayList<>();
//    }
  //3) budas
//     List<E> list;
//    {
//        list = new ArrayList<>();
//    }
//

    public void  add(E e) {
        list.add(e);
    }

    public Iterable <E> order(Comparator<E> cmp)  {
        list.sort(cmp);
        return list;
    }
//    {
//        list = new LinkedList<>();
//    }

//    static double skaitytiIsFailo (){
//        throw new RuntimeException("Kazkas negerai ");
//    }
}
