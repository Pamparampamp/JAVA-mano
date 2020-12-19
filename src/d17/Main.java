package d17;

import d17.d2.Utilities;

public class  Main {

    public static  void main(String [] args) {
        Zmogus z;
        z = new Zmogus();
        z.pavarde = "Jonaitis";
        z.vardas = "Antanas";

        Zmogus z2 = z;
        System.out.println(z2.vardas);

        z2.vardas = "Kazimieras";
        System.out.println(z.pavarde);
        System.out.println(z2.vardas);

    Zmogus z3 = new Zmogus("Ona", "Jone");
    System.out.println(z3.vardas + " " + z3.pavarde);

    System.out.println("z3 " + Utilities.KasYraKas(z3));



//    Zmogus [] zmones = new Zmogus[2];
//    zmones [0]= z2;
//    zmones [1] = z3;
        System.out.println("Spausdinam masyvus:");
            Zmogus[] zmones = {z2 , z3, new Zmogus ("Henrikas IV")};
            String [] vardai  = { "Antanas", "Birute", "Maryte" };


            for (String vardas: vardai) {
                System.out.println(vardas);
            }
        System.out.println("Spausdinam zmoniu masyvus:");
            for (Zmogus zmogus : zmones) {

                    System.out.println(zmogus.vardas +
                            (zmogus.pavarde == null ? "" : (   " " + zmogus.pavarde)));

            }

        for (Zmogus zmogus : zmones) {

           Utilities.spausdintiZmogu(zmogus);


        }
        Mokinys m3 = new Mokinys("Petras"," Petrauksas", 4, null);
        Mokinys m1 = new Mokinys("Antaniukas"," Barnatavicius", 2, null);
//       Mokinys m2 = new Mokinys(null, null,0,null);

        System.out.println("m1 " + Utilities.KasYraKas(m1));
//        Utilities.spausdintiZmogu(m1);



//          klaidu pvz
//        Zmogus zy2 = new Zmogus( "", null);
//        System.out.println("zmogus su tusciu vardu sukurtas sekmingai");
//        Zmogus zy = new Zmogus( null);
//        System.out.println("zmogus su null sukurtas sekmingai");
//
//        Zmogus zx = new Zmogus( null, null);
//        System.out.println("zmogus su pavarde sukurtas sekmingai");
//
//        double x[] =  { 100 , 0 };
//        System.out.println(x[2]);
        System.out.println("The End");
        }


}


