import java.util.*;
public class Emp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-- Basic Employee Pay --\n\n");
        System.out.print("Enter Basic Pay: ");
        int basicPay = sc.nextInt();
        float DA = basicPay/4;
        float HRA = (12*basicPay)/100;
        double PF = (10.5*basicPay)/100;
        int GP = (int)(DA+basicPay+HRA);
        System.out.println("Gross Pay: "+ GP);
        System.out.println("Net Pay: "+(GP-(int)PF));
    }
}
