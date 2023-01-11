import java.util.Scanner;

public class User {
    String UserName;
    float LoanAmount;
    Long UserPhone;
    int c = 0;
    User array[] = new User[10];
    Scanner sc = new Scanner(System.in);

    void Loan(float Total) {

        System.out.println("Enter the Loan Amount");
        LoanAmount = sc.nextFloat();
        if (Total > LoanAmount && c < array.length) {
            User obj1 = new User();
            obj1.LoanAmount = LoanAmount;
            System.out.println("Enter Your Name ");
            obj1.UserName = sc.next();
            System.out.println("Enter Your Phone Number ");
            obj1.UserPhone = sc.nextLong();
            array[c] = obj1;
            c++;
            System.out.println("Loan Approved!");
        } else {
            System.out.println("Loan can't be Approved ");
        }

    }

    void DisplayLoanUsers() {
        int i = 0;

        for (User user : array) {
            if (c == 0) {
                System.out.println("No Candidate Have Availed Loan Facility\n");
                break;
            }
            i++;
            System.out.println(user.UserName);
            System.out.println(user.LoanAmount);
            System.out.println(user.UserPhone + "\n");
            if (i == c)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parent Bank Name ");
        String pBankName = sc.next();
        System.out.println("Enter the parent bank  Id ");
        int pBankId = sc.nextInt();
        System.out.println("Enter the parent bank Amount");
        float pBankAmount = sc.nextFloat();
        System.out.println("Enter the parent bank Intrest ");
        int pBankIntrest = sc.nextInt();
        System.out.println("Enter the parent bank Pnone Number ");
        long pBankPhone = sc.nextLong();
        Bank B1 = new Bank(pBankName, pBankId, pBankAmount, pBankIntrest, pBankPhone);

        System.out.println("Enter the Bank Branch Name ");
        String BankBranchName = sc.next();
        System.out.println("Enter the Branch bank  Id ");
        int BankBranchId = sc.nextInt();
        System.out.println("Enter the Branch bank Amount");
        float BankBranchAmount = sc.nextFloat();
        System.out.println("Enter the Branch bank Interest ");
        int BankBrachIntrest = sc.nextInt();
        System.out.println("Enter the Branch bank Pnone Number");
        long BankBranchPhone = sc.nextLong();
        BankBranch b1 = new BankBranch(BankBranchName, BankBranchId, BankBrachIntrest, BankBranchAmount,
                BankBranchPhone);

        User u1 = new User();
        float Total = B1.getBankAmount() + b1.getBankBranchAmount();

        boolean b = true;
        while (true) {
            int choice;
            System.out.println("\n Enter your Choice \n 1.Need loan ? \n 2.Total Loan Benificiaries\n 3.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    u1.Loan(Total);
                    break;
                case 2:
                    u1.DisplayLoanUsers();
                    break;
                case 3:
                    b = false;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

}