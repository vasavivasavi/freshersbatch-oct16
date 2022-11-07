package assignments;
import java.util.Scanner;
public class Interest {
    public static void main(String[] args){
        double p,r,t,SimpleInterest,CompoundInterest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount");
        p=sc.nextDouble();
        System.out.println("Enter rate amount");
        r=sc.nextDouble();
        System.out.println("Enter time amount");
        t=sc.nextDouble();
        SimpleInterest=p*r*t/100;
        CompoundInterest=(p* Math.pow((1+r/100),t))-p;
        System.out.println("Simple Interest" +SimpleInterest);
        System.out.println("Compound Interest" +CompoundInterest);
    }
}
