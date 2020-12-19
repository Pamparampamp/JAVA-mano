package E07;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ibm.icu.util.ULocale;

import java.util.Locale;

public class Icu4jDemo {

    public static void main(String[] args) {

        double x = 12321.42;

        NumberFormat   numberFormat =  NumberFormat.getCurrencyInstance();

        String str = numberFormat.format(x);

        System.out.println(str);

        RuleBasedNumberFormat ruleBasedNumberFormat =  new RuleBasedNumberFormat(
                new ULocale("lt", "LT"), RuleBasedNumberFormat.SPELLOUT);

        System.out.println(ruleBasedNumberFormat.format(x));


    }
}
