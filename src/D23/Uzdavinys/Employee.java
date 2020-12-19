package D23.Uzdavinys;

public class Employee implements IPayment {

    private String firstName;
    private String lastName;
    private String bankAccountNumber;
    private double amount;

//    private  PaymentHistory  [] history;

    private PaymentHistory[] history = new PaymentHistory[100];
    private int historyRecordsCount = 0;


    @Override
    public String getBankAccountOwnerName() {
        return firstName  + " " + lastName ;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public PaymentHistory[] getHistory() {
        return new PaymentHistory[0];
    }

    @Override
    public void addPaymentHistory(PaymentHistory paymentHistory) {

    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

}

