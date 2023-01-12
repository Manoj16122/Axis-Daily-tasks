import java.util.ArrayList;

public class data extends pdata{
    String name;
    int id;

    data(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public void addvalues(String name[], int id[]){

        ArrayList <data> emp = new ArrayList <data>();
        for (int i = 0; i < n; i++) {
            emp.add(new data(name[i], id[i]));
    }
        printvalues(emp);
}

    private void printvalues(ArrayList<data> emp) {
        for (int i = 0; i < n; i++) {
            data info = emp.get(i);
            System.out.println(info.name);
            System.out.println(info.id);
    }
}


public static void main(String args[]){
    String name[] = {"Manoj", "Sathya", "Ram", "Krshna"};
    int id[] = {01, 03, 06, 07};

    pdata custom = new pdata();
    custom.addvalues(name, id);
    custom.printvalues(name, id);

}
}