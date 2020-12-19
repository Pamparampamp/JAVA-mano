package D24_25;

import java.time.LocalDateTime;
import java.util.Objects;

public class Meteo implements Comparable<Meteo> {
    private LocalDateTime laikas;
    private Double temperatura;
    private int vejoKryptis;
    private int krituliai;
    private double vejoStiprumas;

    public Meteo () {

    }


    public Meteo(double temperatura, int vejoKryptis, int krituliai, double vejoStiprumas) {
        this.temperatura = temperatura;
        this.vejoKryptis = vejoKryptis;
        this.krituliai = krituliai;
        this.vejoStiprumas = vejoStiprumas;
    }

    public Meteo(LocalDateTime laikas, Double temperatura, int vejoKryptis, int krituliai, double vejoStiprumas) {
        this.laikas = laikas;
        this.temperatura = temperatura;
        this.vejoKryptis = vejoKryptis;
        this.krituliai = krituliai;
        this.vejoStiprumas = vejoStiprumas;
    }

    public LocalDateTime getLaikas() {
        return laikas;
    }

    public void setLaikas(LocalDateTime laikas) {
        this.laikas = laikas;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public int getVejoKryptis() {
        return vejoKryptis;
    }

    public void setVejoKryptis(int vejoKryptis) {
        this.vejoKryptis = vejoKryptis;
    }

    public int getKrituliai() {
        return krituliai;
    }

    public void setKrituliai(int krituliai) {
        this.krituliai = krituliai;
    }

    public double getVejoStiprumas() {
        return vejoStiprumas;
    }

    public void setVejoStiprumas(double vejoStiprumas) {
        this.vejoStiprumas = vejoStiprumas;
    }

    public void add(Meteo meteo) {
    }

    @Override
    public int compareTo(Meteo o) {
        System.out.println("  compareTo");
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meteo meteo = (Meteo) o;
        return vejoKryptis == meteo.vejoKryptis &&
                krituliai == meteo.krituliai &&
                Double.compare(meteo.vejoStiprumas, vejoStiprumas) == 0 &&
                Objects.equals(temperatura, meteo.temperatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatura, vejoKryptis, krituliai, vejoStiprumas);
    }

//    @Override
//    public String toString() {
//        return laikas + ", vejoKryptis =  " + vejoKryptis;   //kviecia tevines klases tostring metoda
//    }


    @Override
    public String toString() {
        return "Meteo{" +
                "laikas=" + laikas +
                ", temperatura=" + temperatura +
                ", vejoKryptis=" + vejoKryptis +
                ", krituliai=" + krituliai +
                ", vejoStiprumas=" + vejoStiprumas +
                '}';
    }
}
