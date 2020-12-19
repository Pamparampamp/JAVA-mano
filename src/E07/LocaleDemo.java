package E07;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {
        Locale [] locales = Locale.getAvailableLocales();
       System.out.println(Arrays.asList(locales));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        locale = Locale.CANADA_FRENCH;
        System.out.println(locale);
    //    Locale.setDefault(locale);

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        locale = Locale.forLanguageTag("lt");
        System.out.println(locale);
       // Locale.setDefault(locale);

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        System.out.println(numberFormat.format(3232321.23));


        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        currencyFormatter.setCurrency(Currency.getInstance("USD"));
        currencyFormatter.setGroupingUsed(false);
        System.out.println(currencyFormatter.format(3232321.23));

//        NumberFormat currencyFormatter =  NumberFormat.getCurrencyInstance();
//        System.out.println(currencyFormatter.format(3233221.23));

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(currencyFormatter.format(3233221.23));

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(currencyFormatter.format(3233221.23));



    }

}
