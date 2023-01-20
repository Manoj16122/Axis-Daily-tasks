package JavaProject;

import java.util.Date;

public interface TransactionInterface {
    int transactionId=0;
    Date transactionDate= new Date();
    String transactionType="";
    float  transactionAMount=(float) 0;
    float currentBalance = 0;
    
    void addTransaction(String transactionType, float transactionAmount, float currentBalance);
}
