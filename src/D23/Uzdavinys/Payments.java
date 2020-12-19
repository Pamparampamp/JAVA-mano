package D23.Uzdavinys;

public class Payments {

    public static void printPaymentInfo (IPayment[] payments){
        for (IPayment payment : payments){
            System.out.println(payment.getBankAccountNumber()+ " " + payment.getBankAccountOwnerName()
            + " " + payment.getAmount());
        }

    }

    public static void printMostActive(IPayment[] payments) {
        //TODO

        //reikia patikrinti  kuris klientas padare daugiausiai mokejimu 2.2 uzdav interface skaidre
    }
}
