package Student_hash;

import java.util.Scanner;

public class Student {
    String name;
    int rollno;
    String college;
    String place;
    String branch;
    int sem;

    public Student(String name, int rollno, String college, String place, String branch, int sem2){
        this.name = name;
        this.rollno = rollno;
        this.college = college;
        this.place = place;
        this.branch = branch;
        this.sem =sem2;
    }

    public void display(){
        System.out.println("Student name: " + name);
        System.out.println("Student rollno: " + rollno);
        System.out.println("Student college: " + college);
        System.out.println("Student place: " + place);
        System.out.println("Student branch: " + branch);
        System.out.println("Student Semester: " + sem); 

        
    }


    
}
