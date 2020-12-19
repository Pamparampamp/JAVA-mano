package E01.Uzdavinys1;

public class Automobilis {

    private String marke;
    private String numeris;
    private Savininkas savininkas;


    public Automobilis(String marke, String numeris, Savininkas savininkas) {
        this.marke = marke;
        this.numeris = numeris;
        this.savininkas = savininkas;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public Savininkas getSavininkas() {
        return savininkas;
    }

    public void setSavininkas(Savininkas savininkas) {
        this.savininkas = savininkas;
    }
}
