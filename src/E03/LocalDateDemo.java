package E03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class LocalDateDemo {
                                                //negaudau exception jei ismes programa nulus
    public static void main(String[] args) throws ParseException {

        Date date =   new  Date();
        Date date2 =  new Date("10/11/2020");

        System.out.println("Date= " + date);
        System.out.println("Date2= " + date2);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        System.out.println("Suformotuota = " + simpleDateFormat.format(date));


        // dazniausiai naudoja
        LocalDateTime date3 = LocalDateTime.now();
        System.out.println("date3= " + date3);
        //pridedam + 1 diena
        LocalDateTime date31 = date3.plusDays(1);
        System.out.println("date3= " + date31);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Suformotuota = " + dateTimeFormatter.format(date3));

        //kietas metodas  Suformotuota = 2020 m. gruodžio 7 d. 04:10:02 EET   atsakymas
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withZone(ZoneId.systemDefault());
        System.out.println("Suformotuota = " + dateTimeFormatter.format(date3));

        // formateriai naudojami ir datos dekodavimui (parsenimu) is tekstines eilutes
        Date date4 = simpleDateFormat.parse("2020-12-28 23:40:36 +0200");
        System.out.println("date4= " + date4);
    }

}
