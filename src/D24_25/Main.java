package D24_25;

class Main {
    public static void main(String[] args) {
        Meteo meteo1 = new Meteo();
        meteo1.setKrituliai(5);
        meteo1.setVejoKryptis(15);
        meteo1.setVejoStiprumas(7);

        Meteo meteo2 = new Meteo();
        meteo2.setKrituliai(6);
        meteo2.setVejoKryptis(16);
        meteo2.setVejoStiprumas(4);
        meteo2.setTemperatura(20.5);


        Meteo meteo3 = new Meteo();
        meteo3.setKrituliai(3);
        meteo3.setVejoKryptis(11);
        meteo3.setVejoStiprumas(2);
        meteo3.setTemperatura(10.5);
        //rasau i duomenu baze
        System.out.println(meteo1.getTemperatura());
        //rasau i duomenu baze
        System.out.println(meteo2.getTemperatura());
        System.out.println(meteo3.getTemperatura());

//        int x;
//
//        if (Math.random() < 2) x = 123;
//        System.out.println(x);
      //  double vid = vidutineTemperatura(new Meteo[]{meteo1, meteo2, meteo3});
        IKolekcija kolekcija  = new Kolekcija();
        kolekcija.push(meteo1);
        kolekcija.push(meteo2);
        kolekcija.push(meteo3 );
        kolekcija.put(0, meteo3);
        kolekcija.remove(3);
        double vid = vidutineTemperatura(kolekcija);
        System.out.println("Vidutine temperatura = " + vid);


        byte b = 127;
        double d = b;
        byte b2 = (byte) d;
        System.out.println(b2);
        Double x = 100.0;

    }

    static double vidutineTemperatura(IKolekcija kolekcija ) {
        double vidtemp = 0;
        int reiksmiuSk = 0;
        for (int i = 0; i < kolekcija.size(); i++ ) {
            Meteo m = kolekcija.get(i);
            if (m.getTemperatura() != null) {
                vidtemp += m.getTemperatura();
                reiksmiuSk++;
            }
//        return vidtemp / meteo.length;

        }
        return vidtemp / reiksmiuSk;
    }

}
