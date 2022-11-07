package assignments;

import java.util.Scanner;

public class ArmstrongNumberlimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, i;
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        for (i = num1; i <= num2; i++) {
            if (IsAmstrongNumber(i)) {
                System.out.println("The Amrstrong Numbers are" + i + " ");

            }
        }
    }

    private static boolean IsAmstrongNumber(int i) {
        int OrginalNumber, remainder, result = 0;
        OrginalNumber = i;
        while (OrginalNumber != 0) {
            remainder = OrginalNumber % 10;
            result = (int) (result + Math.pow(remainder, 3));
            OrginalNumber = OrginalNumber / 10;
        }
        if (result == i) {
            return true;
        } else {
            return false;
        }
    }
}
