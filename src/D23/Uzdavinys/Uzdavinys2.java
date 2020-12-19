package D23.Uzdavinys;

import java.time.LocalDateTime;

public class Uzdavinys2 {

    public static void main(String[] args) {

        Client c1 = Client.fromNameAndBankAccount("Microsoft DE","DE21323141223");
        c1.setAmount(-55841.45);

        c1.addPaymentHistory(new PaymentHistory(
               LocalDateTime.of(2020,11,11,10,12),
                "DE55415112220",
                1500


        ));
        c1.addPaymentHistory(new PaymentHistory(
                LocalDateTime.of(2020,11,12,11,22),
                "DE55412311322220",
                1200


        ));
        Employee e1 = new Employee();
        e1.setFirstName("Jonas");
        e1.setLastName("Jonaitis");
        e1.setBankAccountNumber("LT33412311322220");
        e1.setAmount(123123.);
        e1.addPaymentHistory(new PaymentHistory(
                LocalDateTime.of(2020,11,02,12,4),
                "LT33412311322220",
                200.00
        ));

        Payments.printMostActive( new IPayment[] {c1, e1});

    }

}
