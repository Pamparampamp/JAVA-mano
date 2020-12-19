package D23.Uzdavinys;

public class Client implements IPayment {


private String name;
private String code;
private String bankAccount;
private double amount;

private PaymentHistory[] history = new PaymentHistory[100];
private int historyRecordsCount = 0;

public static Client fromNameAndCode(String name, String code){
        Client client = new Client();
        client.setName(name);
        client.setCode(code);
        return  client;

}
    public static Client fromNameAndBankAccount(String name, String bankAccount){
        Client client = new Client();
        client.setName(name);
        client.setBankAccount(bankAccount);
        return  client;

    }

    @Override
    public String getBankAccountNumber() {
        return bankAccount;
    }

    @Override
    public String getBankAccountOwnerName() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void addPaymentHistory (PaymentHistory paymentHistory){
    history[historyRecordsCount] = paymentHistory;
    historyRecordsCount++;
    };

    public PaymentHistory[] getHistory() {

        //return history;
        if (historyRecordsCount == 0 ) return null;
            PaymentHistory[] clone = new PaymentHistory[historyRecordsCount];
            System.arraycopy(history, 0, clone, 0, historyRecordsCount);

            for (int i = 0; i < historyRecordsCount; i++){
                clone[i] = history[i];
            }
            return clone;
    }

}
