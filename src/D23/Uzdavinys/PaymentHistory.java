package D23.Uzdavinys;


import java.time.LocalDateTime;

public class PaymentHistory {

    private LocalDateTime date;
    private String bankAccount;
    private double amount;

    public PaymentHistory(LocalDateTime date, String bankAccount, double amount) {
        this.date = date;
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

}
