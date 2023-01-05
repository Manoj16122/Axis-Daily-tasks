public class mainbank {
    String name;
    int bankid;
    long phono;
    private double banktotalfund;
    protected float loaninterest;

    mainbank(double banktotalfund, float loaninterest){
        this.banktotalfund = banktotalfund;
        this.loaninterest = loaninterest;
    }


    public void loanavail(int loanAmnt, float branchinterest){
        if(loanAmnt<banktotalfund){
        System.out.println("Loan can be approved");
        totalinterest(branchinterest);}
        else{
            System.out.println("Loan cannot be approved");
        }
    }

    public void totalinterest(float branchinterest){
        System.err.println("Total Interest is: " + (loaninterest + branchinterest));
    }
    
}
