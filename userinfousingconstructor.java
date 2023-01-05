public class userinfousingconstructor {

    private int userid;
    public String name;
    String compname;
    protected int age;
    private String pos;

    //constructor

    userinfousingconstructor(int id, String n, String cn, int g, String p){
        this.userid = id;
        this.name = n;
        this.compname = cn;
        this.age = g;
        this.pos = p;
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
        userinfousingconstructor user1 = new userinfousingconstructor(01, "Manoj", "Axis", 22, "analyst");
        userinfousingconstructor user2 = new userinfousingconstructor(02, "Surya", "Manipal", 28, "developer");
        user1.display();
        user2.display();

    }

}

    

