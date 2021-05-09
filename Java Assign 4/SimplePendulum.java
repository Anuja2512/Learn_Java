import java.util.*;

public class SimplePendulum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-- Tension in Simple Pendulum --\n\n");
        System.out.print("Enter Length: ");
        float l = sc.nextFloat();
        System.out.print("Enter Acc. due to Gravity: ");
        float g = sc.nextFloat();
        double T = 6.28 * Math.sqrt(l/g);
        System.out.println("Tension in the string is: "+(float)T);
    }

}