import java.util.Scanner;

public class Samplestudent  {
    String name = "";
    int age = 0;
    String place = "";
    String college = "";
    int count = 0;
    Scanner sc = new Scanner(System.in);
    Samplestudent arrayStudent[];
    
    public void addStudent() {
    if (count < arrayStudent.length) {
    Samplestudent std = new Samplestudent();
    System.out.println("Enter Student name");
    std.name = sc.next();
    System.out.println("Enter Student age");
    std.age = sc.nextInt();
    System.out.println("Enter Student place");
    std.place = sc.next();
    System.out.println("Enter Student collage");
    std.college = sc.next();
    arrayStudent[count] = std;
    count++;
    } else {
    System.out.println("Student obj canot be insert into array size is full");
    }
    
    }
    
    public void displayStudent() {
    for (Samplestudent std : arrayStudent) {
    try {
    System.out.println("Student name : " + std.name);
    System.out.println("Student age : " + std.age);
    System.out.println("Student place : " + std.place);
    System.out.println("Student college : " + std.college);
    } catch (NullPointerException e) {
    System.out.println(e.getMessage());
    }
    }
    }
    
    
    
   // public class MainStudentClass {
    public static void main(String args[]) throws Exception {
    Samplestudent stdObj = new Samplestudent();
    System.out.println("Enter size of array");
    int n = stdObj.sc.nextInt();
    stdObj.arrayStudent = new Samplestudent[n];
    while (true) {
    System.out.println("Enter Case\n 1:addStudent\n 2:Display\n 3:exit");
    int choice = stdObj.sc.nextInt();
    switch (choice) {
    case 1:
    stdObj.addStudent();
    break;
    case 2:
    stdObj.displayStudent();
    break;
    case 3:
    System.exit(1);
    }
    }
}
}
    
    
    //}