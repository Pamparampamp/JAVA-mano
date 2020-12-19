package D30;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Zmones zmones = new Zmones();

        zmones.add(new Zmogus("A","B1", LocalDate.of(2000,10,11)));

        zmones.add(new Zmogus("B","C3", LocalDate.of(2000,11,21)));

        Random random = new Random();
        for (int i = 0; i < 1000; i++){
            zmones.add(new Zmogus("A" + random.nextInt(Integer.MAX_VALUE),
                    "B" + random.nextInt(Integer.MAX_VALUE),
                    LocalDate.of(1980  + random.nextInt(40),random.nextInt(12) + 1,
                            random.nextInt(28)+1)));

        }


        System.out.println("Viso Zmoniu: " + zmones.size());
        System.out.println("Vidutinis amzius : " + zmones.getVidutinisAmzius());
        System.out.println("Pirmas zmogus sarase: " + zmones.get(0));
    }
}
