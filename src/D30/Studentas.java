package D30;

import java.time.LocalDate;

public class Studentas extends  Zmogus{

   private  String mokykla;



    public Studentas(String vardas, String pavarde, LocalDate gimData) {
        super(vardas, pavarde, gimData);

    }

    public Studentas(String vardas, String pavarde, LocalDate gimData, String mokykla) {
        super(vardas, pavarde, gimData);
        this.mokykla = mokykla;
    }


    public String getMokykla() {
        return mokykla;
    }

    public void setMokykla(String mokykla) {
        this.mokykla = mokykla;
    }

    @Override
    public String toString() {
        return "Studentas(" +"vardas='" + getVardas() + '\'' +
                ", pavarde='" + getPavarde() + '\'' +
                ", gimData=" + getGimData() +
                ", mokykla='" + mokykla + '\'' +
                ')';
    }
}
