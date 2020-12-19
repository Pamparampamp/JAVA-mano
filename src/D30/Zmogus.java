package D30;

import java.time.LocalDate;

public class Zmogus {


    private String vardas;
    private String pavarde;
    private LocalDate gimData;

    public Zmogus(String vardas, String pavarde, LocalDate gimData) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimData = gimData;
    }



    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public LocalDate getGimData() {
        return gimData;
    }

    public void setGimData(LocalDate gimData) {
        this.gimData = gimData;
    }

    @Override
    public String toString() {
        return "Zmogus(" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", gimData=" + gimData +
                ')';
    }
}
