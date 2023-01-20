package JavaProject;

import java.util.Scanner;

public class Customer implements CustomerInterface {
    public Account account;
    String name="";
    int id=0;
    String email="";
    int password;
    long cardNo=0;
    long phono=0;
    String address="";

    @Override
    public void addCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customerID \n");
        this.id=sc.nextInt();
        System.out.print("Enter Customer name \n");
        this.name = sc.next();
        System.out.print("Enter Customer email \n");
        this.email = sc.next();
        System.out.print("Enter Customer password ]n");
        this.password = sc.nextInt();
        System.out.print("Enter Customer cardNo \n");
        this.cardNo = sc.nextLong();
        System.out.print("Enter Customer phono \n");
        this.phono = sc.nextLong();
        System.out.print("Enter Customer Address \n");
        this.address = sc.next();
        this.account = new Account().addAccount();

        
    }

    @Override
    public void deleteCustomer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editCustomer() {
        // TODO Auto-generated method stub
        
    }
    
}
