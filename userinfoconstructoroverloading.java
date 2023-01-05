public class userinfoconstructoroverloading {
    
    private int userid;
    public String name;
    String compname;
    protected int age;
    private String pos;

    userinfoconstructoroverloading(int id, String n, String cn, int g, String p){
        this.userid = id;
        this.name = n;
        this.compname = cn;
        this.age = g;
        this.pos = p;
    }

    userinfoconstructoroverloading(String n, String cn){
        this.name = n;
        this.compname = cn;
    }

    userinfoconstructoroverloading(){

    }

    public void display(){
        System.out.println("User ID is "+userid);
        System.out.println("User name "+name);
        System.out.println("Company name "+compname);
        System.out.println("User age "+age);
        System.out.println("user position "+pos);
    }

    public static void main(String args[])
    {
        System.out.println("User Info is");
        userinfoconstructoroverloading user1 = new userinfoconstructoroverloading(01, "Manoj", "Axisbank", 22, "developer");
        userinfoconstructoroverloading user2 = new userinfoconstructoroverloading("Surya", "Microsoft");
        userinfoconstructoroverloading user3 = new userinfoconstructoroverloading();
        user1.display();
        user2.display();
        user3.display();
    }
        





}
