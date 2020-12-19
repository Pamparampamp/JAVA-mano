package d17;

public class Mokinys extends Zmogus {



    public int klase;
   public int[] trimestras ;



   Mokinys(String vardas, String pavarde, int klase, int[] trimestras){

//    this.vardas = vardas;.
       super(vardas);
    this.pavarde = pavarde;
    this.klase = klase;
    this.trimestras = trimestras;


   }

    Mokinys (String vardas, String pavarde){
    this.vardas = vardas;
    this.pavarde = pavarde;
}


}
        class Studentas extends Mokinys {
            public Studentas (String vardas, String pavarde){
        super(vardas, pavarde);
            }
     }