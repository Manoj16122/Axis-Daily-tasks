package ArrayList_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class demo {
    String name;
    int age;
    String place;
    
    demo(String name, int age, String place){
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public static void main(String[] args){
        demo s1 = new demo("Manoj", 22, "Bengaluru");
        demo s2 = new demo("Shiva", 19, "Mysore");
        demo s3 = new demo("Vikram", 15, "Mangalore");

        ArrayList <demo> student = new ArrayList <demo>();

        student.add(s1);
        student.add(s2);
        student.add(s3);

        for (demo s : student){
            System.out.println("Student: ");
            System.out.println("Name: " +s.name);
            System.out.println("Age: " +s.age);
            System.out.println("Place: " +s.place);

        }

        Iterator obj1 = student.iterator();
        while(obj1.hasNext()){
            
          //  obj1.next();
            demo obj2 = (demo) obj1.next();
            System.out.println(obj2.name +obj2.age + obj2.place);
        }


        System.out.println(student.size());

        System.out.println( student.isEmpty());

        student.get(1);

  }
}