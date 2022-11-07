package desert;
import java.util.Scanner;

public class DesertItem2 extends DesertItems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the role : customer(or)owner ");
        String role=sc.next();
        if(role.equals("Owner"))
        {
            DesertItem2 ds=new DesertItem2();
            System.out.println(ds.additemstostorage("Candy "," Cookie "," Icecream"));
        }
        else if(role.equals("customer"))
        {
            System.out.println("Candies available");
            System.out.println("------------------");
            DesertItem desertitem1=new CandyItem();
            System.out.println("Candy : " +desertitem1.getcost(1)+ " in rupees");
            DesertItem desertitem2=new Cookie();
            System.out.println("Cookie : "+desertitem2.getcost(1)+ "in rupees");
            DesertItem desertitem3=new Icecream();
            System.out.println("Icecream : "+desertitem3.getcost(1)+ "in rupees");
            System.out.println("Please enter valid input");
        }
        sc.close();

    }

}
