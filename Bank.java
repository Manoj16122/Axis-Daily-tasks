public class Bank {
    String BankName;
    int BankId;
    private float BankAmount;
    private float BankIntrest;

    public float getBankAmount() {
        return BankAmount;
    }

    public float getBankIntrest() {
        return BankIntrest;
    }

    Long BankPhone;

    public Bank(String bankName, int bankId, float bankAmount, float bankIntrest, Long bankPhone) {
        BankName = bankName;
        BankId = bankId;
        BankAmount = bankAmount;
        BankIntrest = bankIntrest;
        BankPhone = bankPhone;
    }

}