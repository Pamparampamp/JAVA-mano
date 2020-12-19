package D23.Uzdavinys;

public class Uzdavinys1 {

    public static void main(String[] args) {


        Employee e1 = new Employee();
        e1.setFirstName("Jonas");
        e1.setLastName("Jonaitis");
        e1.setBankAccountNumber("LT11232133123");
        e1.setAmount(123123.);

        Employee e2 = new Employee();
        e2.setFirstName("Petras");
        e2.setLastName("Petrauskas");
        e2.setBankAccountNumber("LT112323111113");
        e2.setAmount(122222.);


        Client c2 = new Client();
        c2.setName("Microsoft DE");
        c2.setBankAccount("DE21323141223");
        c2.setAmount(-55841.45);


            IPayment[] payments = { e1, c2, e2, };
            Payments.printPaymentInfo(payments);

    }


}
