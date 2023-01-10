import java.util.Scanner;

public class student implements studentInterface {
    String name = "";
    int age = 0;
    String place = "";
    String college = "";
    int count=0;
    Scanner sc = new Scanner(System.in);
    student arrStudent[];


  //  student(String name, int age, String place, String college){
  //      this.name = name;
  //      this.age = age;
   //     this.place = place;
     //   this.college = college;

    //}


    public void addstudent(){
        if (count < arrStudent.length){
            student std = new student();
            System.out.println("Enter student name");
            std.name = sc.next();
            System.out.println("Enter Student age");
            std.age = sc.nextInt();
            System.out.println("Enter Student place");
            std.place = sc.next();
            System.out.println("Enter Student college");
            std.college = sc.next();
            count++;
        }
        else{
            System.out.println("Limit Reached");
        }
    }
    


    public void displaystudent(){
    for(student std : arrStudent){
       try{
        System.out.println("Name: "+ std.name);
        System.out.println("Age: "+ std.age);
        System.out.println("Place: "+ std.place);
        System.out.println("College: "+ std.college);
   } catch (NullPointerException e) {
        System.out.println(e.getMessage());
    }
}
}

    
    public static void main(String args[]) throws Exception{
        student stdobj = new student();
        System.out.println("Enter the number of students");
        int n = stdobj.sc.nextInt();
        stdobj.arrStudent = new student[n];
        while(true){
            System.out.println("Choose any one\n 1.addstudent\n 2.displaystudent\n 3.exit");
            int choice=stdobj.sc.nextInt();
            switch(choice){
                case 1: stdobj.addstudent();
                break;
                case 2: stdobj.displaystudent();
                break;
                case 3: System.exit(1);
            }

        }

    }
}



