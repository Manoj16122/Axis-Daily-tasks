public class BankBranch {
    String BankBranchName;
    int BankBranchId;
    private float BankBranchIntrest;
    private float BankBranchAmount;

    public float getBankBranchIntrest() {
        return BankBranchIntrest;
    }

    public float getBankBranchAmount() {
        return BankBranchAmount;
    }

    Long BankBarnchPhone;

    public BankBranch(String bankBranchName, int bankBranchId, float bankBranchIntrest, float bankBranchAmount,
            Long bankBarnchPhone) {
        BankBranchName = bankBranchName;
        BankBranchId = bankBranchId;
        BankBranchIntrest = bankBranchIntrest;
        BankBranchAmount = bankBranchAmount;
        BankBarnchPhone = bankBarnchPhone;
    }

}
