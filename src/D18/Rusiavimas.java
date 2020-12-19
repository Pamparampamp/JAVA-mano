package D18;

public class Rusiavimas {

    public static void main(String[] args) {

        String [] zodziai = {
                "č",
                "a",
                "d",
                "ę",
                "Ž",
                "j",
                "A",
                "f",
                "ą",
                "c",
                "y",
                "ė",
                "b"
        };
        spausdinti(zodziai);
        String [] rezultatas = lygiuoti(zodziai);
        spausdinti(rezultatas);
    }

    private static String[] lygiuoti(String[] zodziai) {
        //Sukuriam rezultato masyva ir  nukopijuojame pradinio masyvo  reiksmes i ji
        //        return zodziai;
        String [] rez = new  String[zodziai.length];
        for (int i = 0; i < zodziai.length; i++) {
            rez[i]= zodziai[i];
        }
        //Lygiuojame
        for( int i = 0 ; i < rez.length - 1 ; i++){
            for( int j = i + 1 ; j < rez.length ; j++ ){

//                    if (rez[i] > rez[j]){
                if (arPirmasZodisDidesnisUzAntra(rez[i] ,rez[j])){
                        String x = rez[i];
                        rez[i] = rez[j];
                        rez[j] = x;

                    }


            }
        }

        return rez;
    }

    private static boolean arPirmasZodisDidesnisUzAntra(String s1, String s2) {
        char[] a = s1.toUpperCase().toCharArray();
        char[] b = s2.toUpperCase().toCharArray();

        return arDidesnisSimbolis(a[0], b[0]);
    }

    private static boolean arDidesnisSimbolis(char c1, char c2) {
        return lietuviskai(c1) > lietuviskai(c2);
    }

    private static char lietuviskai (char c) {
        if (c == 'Ą') c = 'A';
        else if (c == 'Č') c = 'C';
        else if (c == 'Ė' || c == 'Ę') c = 'E';
        else if (c == 'Į' || c == 'Y') c = 'I';
        else if (c == 'Š') c = 'S';
        else if (c == 'Ų' || c == 'Ū') c = 'U';
        else if (c == 'Ž') c = 'Z';
        return c;
    }

    private static void spausdinti(String[] zodziai) {
        System.out.println("Zodziai:");
        for (String z:zodziai) System.out.println(z);
    }


}
