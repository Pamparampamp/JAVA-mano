package D30;

import java.time.LocalDate;
import java.util.Random;

public class MainStudentas {


    public static void main(String[] args) {

        Zmones <Studentas> studentai = new Zmones<Studentas>();

    //    studentai.add(new Zmogus("A","B1", LocalDate.of(2000,10,11)));
        Random random = new Random();

        for (int i = 0; i < 1000; i++){
            studentai.add(new Studentas("A" + random.nextInt(Integer.MAX_VALUE),
                    "B" + random.nextInt(Integer.MAX_VALUE),
                    LocalDate.of(1980  + random.nextInt(40),random.nextInt(12) + 1,
                            random.nextInt(28)+1)));
        }
        System.out.println("Viso Studentu: " + studentai.size());
        System.out.println("Vidutinis amzius : " + studentai.getVidutinisAmzius());
        System.out.println("Pirmas Studentas sarase: " + studentai.get(0));


//        Zmones<String> z2 = new Zmones<>();
//        z2.add("aaa");
        Zmones<Zmogus> z3 = new Zmones<>();
        z3.add(new Zmogus("A","B1", LocalDate.of(2000,10,11)));

//        Zmones<Zmogus> z4 = studentai;
    }
}
