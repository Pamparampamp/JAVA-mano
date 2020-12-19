package darbas1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class uzdavin1  {

   public static int skaicius;

    public static void main(String[] args) {

        Integer [] skaiciai  = {5,8,9,1,-4};
        System.out.println(Arrays.toString(skaiciai));


        for (Integer skaicius : skaiciai) {

            System.out.println(skaicius);

        }
        System.out.println("*****************************");

        spausdinti(skaiciai);

    }



    private static int Metodas(int skaicius){
int a = 9;
 int b = 8 ;
 int c = 5 ;
 int d = 4 ;
 int e = -1;

        if (  skaicius == a )  skaicius = 8;
        else  if ( skaicius == b ) skaicius = 8;
        else  if (c >=  skaicius) c = 5;
        else  if (b > skaicius && c < skaicius ) skaicius = 4;
        else  if (e >= skaicius ) e = -1;

        return  skaicius;

}

    public uzdavin1() {
    }

    public static int getSkaicius() {
        return skaicius;
    }


    public static void setSkaicius(int skaicius) {
        uzdavin1.skaicius = skaicius;
    }


    public static void spausdinti(Integer[] args) {
        int rezultatas = Metodas(skaicius);
        System.out.println(rezultatas);

    }


}

