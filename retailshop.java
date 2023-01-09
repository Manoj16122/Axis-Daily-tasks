import java.util.Scanner;

public class retailshop implements retail {


    @Override
    public float getTotalcost(float tax, float cost, float number){
        float totalcost = (cost*(tax/100))*number;
        System.out.println("Total cost is "+totalcost);
        return totalcost;
    }

    @Override
    public float getTotalextendedcost(float cost1, float cost2, float cost3) {
        float totalextendedcost = cost1+cost2+cost3 ;
        System.out.println("Cost is " + totalextendedcost);
        return totalextendedcost;
    }

 
   @Override
    public void getTotaldiscount(double totalextendedcost) {
        double costafterdiscount = (totalextendedcost * (0.98));
        System.out.println("Cost after discount is " +costafterdiscount);
    }
    
    public static void main(String args[], double totalextendedcost){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the quantity of cosmetics: " );
            float cosmetics = sc.nextFloat();
            System.out.println("Enter the quantity of perfume: ");
            float perfume = sc.nextFloat();
            System.out.println("Enter the quantity of clothes: ");
            float clothes = sc.nextFloat();

            retailshop s1 = new retailshop();
            float cost1 = s1.getTotalcost(7,10000,cosmetics);
            System.out.println("Total cost of cosmetics: " + cost1);
            float cost2 = s1.getTotalcost(12,5000,perfume);
            System.out.println("Total cost of perfume: " + cost2);
            float cost3 = s1.getTotalcost(4,7000,clothes);
            System.out.println("Total cost of clothes: " + cost3);

            float totalcost =s1.getTotalextendedcost(cost1,cost2,cost3);

            s1.getTotaldiscount(totalextendedcost);
        }







    }


    
}
    

