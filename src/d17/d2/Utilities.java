package d17.d2;

import d17.Mokinys;
import d17.Zmogus;

public class Utilities {
 public   static void spausdintiZmogu (Zmogus z){
        System.out.println("-------------------------------");
        System.out.println("vardas:" +  z.vardas );
        System.out.println("pavarde:" +
                (z.pavarde == null ? "be pavardes" : z.pavarde));
        System.out.println("-------------------------------");
    }

    public  static  String KasYraKas(Object x){
        String Kas = "";

        if (x instanceof Zmogus){
            Kas = "yra Zmogus";


        }else {
            Kas = " nera Zmogus";
        }
        if (x  instanceof Mokinys){
           Kas = Kas + " ir yra Mokinys";
        }else {
            Kas = Kas +  " ir nera Mokinys ";
        }
        return Kas;

    }



}
