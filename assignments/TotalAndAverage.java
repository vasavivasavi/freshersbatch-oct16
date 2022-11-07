package assignments;
import java.util.Scanner;
public class TotalAndAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1=" ",name2=" ",name3=" ";
        System.out.println("Name:  " + name1);
        name1 = sc.next();
        System.out.println("Name:  " + name2);
        name2= sc.next();
        System.out.println("Name:  " + name3);
        name3= sc.next();
        System.out.println("Enter marks of name1");
        int marks1a=sc.nextInt(), marks1b=sc.nextInt(),marks1c=sc.nextInt();
        System.out.println("Enter marks of name2");
        int marks2a=sc.nextInt(), marks2b=sc.nextInt(),marks2c=sc.nextInt();
        System.out.println("Enter marks of name3");
        int marks3a=sc.nextInt(),marks3b=sc.nextInt(),marks3c=sc.nextInt();
        System.out.println("Total Marks1: " + (marks1a + marks1b + marks1c));
        System.out.println("Total Marks2: " + (marks2a + marks2b + marks2c));
        System.out.println("Total Marks3: " + (marks3a + marks3b + marks3c));
        System.out.println("Average Marks1: " + (marks1a + marks1b + marks1c)/3);
        System.out.println("Average Marks2: " + (marks2a + marks2b + marks2c)/3);
        System.out.println("Average Marks3: " + (marks3a + marks3b + marks3c)/3);
    }
}
