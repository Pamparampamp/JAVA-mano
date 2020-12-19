package D24_25;

import java.util.Objects;

public class Kolekcija implements IKolekcija {


    private Meteo[] meteos = new Meteo[100];
    private int size = 0;


    public void push(Meteo meteo) {
        if (meteos.length == size) {
            //reiskia jau kad masyvas pilnai uzpildytas
            Meteo[] mateosNew = new Meteo[meteos.length + 100];
//            for (int i = 0 ; i < meteos.length; i++){
//                mateosNew[i] = meteos[i];
//            }
            System.arraycopy(meteos, 0, mateosNew, 0, meteos.length);
            meteos = mateosNew;
        }
        meteos[size] = meteo;
        size++;
    }

//    @Override
//    public void push(Meteo... meteoArray) {
//    if (meteoArray.length == 0) return;
//    int count = meteoArray.length;
//    int freeSpace = meteos.length - size;
//    if (count <= freeSpace){
//        //TODO
//    }else {
//        //TODO
//    }
//
//    }


    @Override
    public void push(Meteo... meteoArray) {

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Meteo get(int index) {
        return this.meteos[index];
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void put(int index, Meteo meteo) {

    }
}

