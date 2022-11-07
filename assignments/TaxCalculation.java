package assignments;
import java.util.Scanner;
public class TaxCalculation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float amount,tax;
        System.out.println("Enter a amount");
        amount=sc.nextFloat();
        if(amount >0 && amount <=180000){
            tax=0;
        }else if(amount >=181001 && amount <=300000){
            tax=10;
        }else if(amount >=300001 && amount <=500000){
            tax=20;
        }else if(amount >=500001 && amount <=1000000) {
            tax = 30;
        } else {
            tax=40;
        }
        double taxAmount=amount*tax/100;
        System.out.println("Income tax" +taxAmount);

    }
}
