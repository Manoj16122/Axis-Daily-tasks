public class branch extends college{
    String branchname;
    int branchid;
    int branchstaff;

    branch(String branchname, int branchid, int branchstaff, String collegename, int collegeid, String collegeplace){
        super(collegename, collegeid, collegeplace);
        this.branchname = branchname;
        this.branchid = branchid;
        this.branchstaff = branchstaff;

    }

    
}
