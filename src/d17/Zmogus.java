package d17;

public class Zmogus {
    public String vardas;
    public String pavarde;


 protected     Zmogus() {
        System.out.println("Spausdinamas tekstas default konstruktoriaus");
    }

 public    Zmogus(String vardas, String pavarde) {
//        if (vardas == null) {
//            //klaida
//
////            System.err.println("Nenurodytas vardas");
//          throw new RuntimeException("Nenurodytas vardas");
//
//        } else {
//            this.vardas = vardas;
//            this.pavarde = pavarde;
//        }
        this(vardas);
        this.pavarde = pavarde;
        }
    public     Zmogus(String vardas ) {
//            if (vardas == null || vardas.length() == 0) {
//                //klaida
//
////            System.err.println("Nenurodytas vardas");
//                throw new RuntimeException("Nenurodytas vardas");
//
//            } else {
//                this.vardas = vardas;
//            }
            patikrintiVardas(vardas);
            this.vardas = vardas;
        }
            void patikrintiVardas (String vardas){
                if (vardas == null || vardas.length() == 0) {
                    //klaida

//            System.err.println("Nenurodytas vardas");
                    throw new RuntimeException("Nenurodytas vardas");
                }
            }

        }

