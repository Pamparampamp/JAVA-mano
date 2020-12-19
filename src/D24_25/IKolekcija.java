package D24_25;

public interface IKolekcija {


    void push (Meteo... meteoArray);  //Meteo... uzrasymas reiskia masyva ideda.  push i masyvo pabaiga meteo elementa

    int size(); // ciklui reikia dydzio,ilgio

    Meteo get(int index);  // paimam elementa meteo su kazkokiu indeksu

    void remove(int index);  // naikinam masyvo elementa

    void put (int index, Meteo meteo);  // i masyvo pradzia idedam elementus
}
