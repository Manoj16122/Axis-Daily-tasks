import java.util.Scanner;

public class userinfo {
   private int userid;
    public String name;
    String compname;
    protected int age;
    private String pos;
    //void insertdata(int id, String n, String cn, int g, String p)
    //{
    //    userid = id;
     //   name = n;
       // compname = cn;
        //age = g;
        //pos = p;
    // }
    public void Createuser()
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter userid :");
            userid = in.nextInt();
            System.out.print("Enter name :");
            name = in.next();
            System.out.print("Enter company name :");
            compname = in.next();
            System.out.print("Enter age :");
            age = in.nextInt();
            System.out.print("Enter position :");
            pos = in.next();
        }

    }
    public void displayuser()
    {
        System.out.println("User id is " + userid);
        System.out.println("User name is " + name);
        System.out.println("Company name is " + compname);
        System.out.println("User age is " + age);
        System.out.println("User position is " + pos);
    }

public static void main(String[] args)
{
    userinfo user = new userinfo();
    user.Createuser();
    user.displayuser();
}
}

