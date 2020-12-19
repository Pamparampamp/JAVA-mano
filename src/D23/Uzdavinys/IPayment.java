package D23.Uzdavinys;

public interface IPayment {


    String getBankAccountNumber();

    String getBankAccountOwnerName();

    double getAmount();

//    int getHistoryRecordsCount();
//    PaymentHistory[] getHistory();
//    default   PaymentHistory[] getPaymentHistory() {
//
//       if (getHistoryRecordsCount () == 0 ) return null;
//       PaymentHistory[] clone = new PaymentHistory[getHistoryRecordsCount()];
////       System.arraycopy(history, 0, clone, 0, getHistoryRecordsCount());
//
//       for (int i = 0; i < getHistoryRecordsCount(); i++){
//           clone[i] = getHistory()[i];
//       }
//       return clone;
//   }
PaymentHistory[] getHistory();
    void addPaymentHistory (PaymentHistory paymentHistory);
}
