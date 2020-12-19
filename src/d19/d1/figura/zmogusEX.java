package d19.d1.figura;

import d17.Zmogus;

import java.time.LocalDate;

public class zmogusEX extends Zmogus {

 private  LocalDate  gimimoData;
   private int amzius;

    public zmogusEX(String vardas, String pavarde, LocalDate gimimoData) {
        super(vardas, pavarde);
   //  this.gimimoData = gimimoData;
    // this.amzius = LocalDate.now().getYear() - gimimoData.getYear();
        setGimimoData(gimimoData);

    }

    public int getAmzius() {
        return amzius;
    }

    public LocalDate getGimimoData() {
        return gimimoData;
    }

    public void setGimimoData(LocalDate gimimoData) {
        this.gimimoData = gimimoData;
        this.amzius = LocalDate.now().getYear() - gimimoData.getYear();
    }
}
class zmogusTest  {
    public static void main(String[] args) {
        zmogusEX z = new zmogusEX("Ana", "Marija",
                LocalDate.of(2000, 7, 15));

        System.out.println(z.getGimimoData() + ", amzius =  " + z.getAmzius());
        z.setGimimoData(LocalDate.of(2010,12,15));
//        z.amzius = 10;
        System.out.println(z.getGimimoData() + ", amzius = " + z.getAmzius());

        spausdintiInfo(z);
        spausdintiInfo(new Zmogus("Jonas", "Petraitis"));
        Zmogus zm = z;
        System.out.println(zm.getClass().getName());
    }

    static void spausdintiInfo(Zmogus z){
        System.out.println(z.vardas + " " + z.pavarde+
                " " + (z instanceof  zmogusEX ? ((zmogusEX) z).getGimimoData() : " "  ));

    }

}
