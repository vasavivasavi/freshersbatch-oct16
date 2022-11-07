package assignments;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        if (!validateUser()) {
            System.out.println("Contact Admin");
        }
    }
        private static boolean validateUser() {
            boolean result = false;
            Scanner sc = new Scanner(System.in);
            String Username, Password;
            for (int i = 0; i <= 3; i++) {
                System.out.print("Enter username:");
                Username = sc.next();
                System.out.print("Enter password:");
                Password = sc.next();
                if (Username.equals("vasavi") && Password.equals("vasavi123")) {
                    System.out.println("Welcome" + Username);
                    result = true;
                    return result;
                }
                    return result;
            }
            return result;
        }

}
