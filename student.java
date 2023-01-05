public class student extends branch{
    String studentname;
    int studentid;
    String studentplace;

    student(String studentname, int studentid, String studentplace, String branchname, int branchid, int branchstaff, String collegename, int collegeid, String collegeplace){
        super(branchname, branchid, branchstaff, collegename, collegeid, collegeplace);
        this.studentname = studentname;
        this.studentid = studentid;
        this.studentplace = studentplace;
    }

    public void display(){
        System.out.println("Student name is "+studentname);
        System.out.println("Student id is "+studentid);
        System.out.println("Student place is "+studentplace);
        System.out.println("Branch name is "+branchname);
        System.out.println("Branch id is "+branchid);
        System.out.println("Branch staff is "+branchstaff);
        System.out.println("College name is "+collegename);
        System.out.println("College id is "+collegeid);
        System.out.println("College place is "+collegeplace);
        
    }

    public static void main(String args[]){
        student manoj = new student("Manoj", 123, "Gayatrinagar", "Information Science", 02, 28, "Atria", 023, "RTnagar");
        manoj.display();

    }

    
}
