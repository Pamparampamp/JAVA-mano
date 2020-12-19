package D30;

//import java.time.LocalDate;
//import java.time.Period;
//import java.util.ArrayList;
//
//
//public class Zmones  extends ArrayList<Zmogus> {
//
//    private double vidutinisAmzius;
//
//    public double  getVidutinisAmzius () {
//
//       return   vidutinisAmzius;
//      }
//
//    @Override
//    public boolean add(Zmogus zmogus) {
//        //TODO suskaiciuoti vidutini amziu
//
//        double bendrasAmzius = vidutinisAmzius * this.size();
//         int metuSkirtumas =  Period.between(zmogus.getGimData(), LocalDate.now()).getYears();
//        vidutinisAmzius = (bendrasAmzius + metuSkirtumas) / (size() + 1);
//        //turiu kviesti tevines klase add metoda
//        return super.add(zmogus);
//    }
//
//    @Override
//    public Zmogus remove(int index) {
//        return null;
//    }
//}

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

class ZmonesEx <E extends Zmogus>  extends ArrayList<E> {

}


public class Zmones <E extends Zmogus> {

    private ArrayList<E> vidinisListas = new ArrayList<>();

    private double vidutinisAmzius;

    public double getVidutinisAmzius() {
        return vidutinisAmzius;
    }

    public boolean add(E zmogus) {
        //TODO suskaiciuoti vidutini amziu

        double bendrasAmzius = vidutinisAmzius * vidinisListas.size();
        int metuSkirtumas =  Period.between(zmogus.getGimData(), LocalDate.now()).getYears();
        vidutinisAmzius = (bendrasAmzius + metuSkirtumas) / (vidinisListas.size() + 1);
        //turiu kviesti tevines klase add metoda
        return vidinisListas.add(zmogus);
    }

    public int size(){
        return vidinisListas.size();
    }

    public E get(int i) {
         return vidinisListas.get(i);
    }
}
