package Student_hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Helperclass {
   // public Helperclass(String name, int rollno, String college, String place, String branch, int sem) {
    //    super(name, rollno, college, place, branch, sem);
   // }

    HashMap<Integer, Student>  hm = new HashMap<Integer, Student>();
    Scanner sc = new Scanner(System.in);

    public void addStudent(){
        System.out.println("Enter Student Name");
        String name = sc.next();
        System.out.println("Enter Student Rollno");
        int rollno = sc.nextInt();
        System.out.println("Enter Student College");
        String college = sc.next();
        System.out.println("Enter Student branch");
        String branch = sc.next();
        System.out.println("Enter Student Place");
        String place = sc.next();
        System.out.println("Enter Student Sem");
        int sem = sc.nextInt();
        while(this.hm.containsKey(rollno)){
            System.out.println("Already in database");
            System.out.println("Enter a new rollno");
            rollno = sc.nextInt();
        }
        Student std = new Student(name, rollno, college, place, branch, sem);
        this.hm.put(rollno, std);
    }
    
    public void searchStudent(){
        System.out.println("Enter the rollno to search ");
        int rollno = sc.nextInt();
        boolean flag = hm.containsKey(rollno);
        if(flag == true){
            System.out.println("Student of that rollno exists");
            this.hm.get(rollno).display();
        }else{
            System.out.println("Student with that rollno doesn't exist");
        }
    }

    public void deleteStudent(){
        System.out.println("ENter the rollno of the student to delete");
        int rollno = sc.nextInt();
        Student std = this.hm.remove(rollno);
        if(std  != null){
            System.out.println("Deleted student details");
            std.display();
        }else{
            System.out.println("Rollno not found");
        }
        
    }


    public static void main(String args[]){
        Helperclass obj1 = new Helperclass();
        while(true){
        System.out.println("1. Add new Student\n 2. Search for a student\n 3. Delete a student");
        System.out.println("CHoose any one option");
        int choice = obj1.sc.nextInt();
        switch(choice){
            case 1:obj1.addStudent();
            break;
            case 2:obj1.searchStudent();
            break;
            case 3:obj1.deleteStudent();
            break;
            default:
            System.out.println("Invalid Option");
        }



    }

    }
    

}
