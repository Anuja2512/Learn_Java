import java.util.*;
public class Feedback {
    
    public static void feedback() {
        System.out.println("\nSign In to give Feedback\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = sc.next();
        System.out.println("Enter Password");
        String password = sc.next();
        sc.nextLine();
        System.out.print("Enter your Feedback: ");
        String feedback2 = sc.nextLine();
        System.out.println("\nYour Feedback is:\n"+feedback2);
    }
}
