package assignments;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        float mark1, mark2,mark3,avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark1");
        mark1  = sc.nextFloat();
        System.out.println("Enter mark2");
        mark2 = sc.nextFloat();
        System.out.println("Enter mark3");
        mark3 = sc.nextFloat();
        if(mark1 >60 && mark2>60 && mark3>60){
            System.out.println("PASSED");
        }else if((mark1 >60 && mark2>60) || (mark2 >60 && mark3>60) || (mark1 >60 && mark3>60)){
            System.out.println("PROMOTED");
        }else if((mark1>60 || mark2>60 ||mark3>60 )|| (mark1<60 && mark2<60 && mark3<60 )){
            System.out.println("FAILED");
        }
    }
}
