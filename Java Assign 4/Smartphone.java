import java.util.*;
public class Smartphone {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-- Smartphone Billing Price --\n\n");
        System.out.print("Printed Amount: ");
        int printedAmount = sc.nextInt();
        printedAmount -=   printedAmount/5;
        int finalPrice = printedAmount + (12*printedAmount)/100;
        System.out.println("Billing Price: "+finalPrice);
    }
}
