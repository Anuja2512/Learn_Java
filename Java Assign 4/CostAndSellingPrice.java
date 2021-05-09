import java.util.*;
public class CostAndSellingPrice {
    
    public static void main(String[] args) {
        System.out.println("\n-- Cost and Selling Price --\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();
        if(cp == sp)
        {
            System.out.println("Neither Profit nor Loss.");
        }
        else if(cp > sp)
        {
            float loss = cp - sp;
            float lossPercent = (loss/cp)*100;
            System.out.println("Loss: "+loss);
            System.out.println("Loss Percent: "+lossPercent);
        }
        else
        {
            float profit = sp - cp;
            float profitPercent = (profit/sp)*100;
            System.out.println("Profit: "+profit);
            System.out.println("Profit Percent: "+profitPercent);
        }
    }
}
