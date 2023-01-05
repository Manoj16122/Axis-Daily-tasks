import java.util.Scanner;

public class branchbank extends mainbank{

    String branchname;
    int branchid;
    long bphono;
    private double branchtotalfund;
    private float branchinterest;

    branchbank(String branchname, int branchid, long bphono, double branchtotalfund, float branchinterest , double banktotalfund, float loaninterest, 
    String name,int bankid, long phono){
    super(banktotalfund, loaninterest);
    super.name = name;
    super.bankid = bankid;
    super.phono = phono;
    this.branchname = branchname;
    this.branchid = branchid;
    this.bphono = bphono;
    this.branchtotalfund = branchtotalfund;
    this.branchinterest = branchinterest;
}


    public static void main(String args[])
    {
        branchbank Axis  = new branchbank("Axis", 0123, 25845690, 50000, 2, 90000, 1, "Sathya", 0236, 254869622);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the loan amount");
            int loan = sc.nextInt();
            Axis.loanavail(loan, Axis.branchinterest);
        }
    
    }
}