import java.util.*;
public class NumbersInRange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-- Numbers in a Range --\n\n");
        System.out.print("Enter Lower Range: ");
        int m = sc.nextInt();
        System.out.print("Enter Higher Range: ");
        int n = sc.nextInt();
        
        //positive numbers
        System.out.println("List of Positive Numbers:");
        for(int i=m; i<=n; i++) {
            if(i>0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //negative numbers
        System.out.println("List of Negative Numbers:");
        for(int i=m; i<=n; i++) {
            if(i<0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Sum of Positive n Negative Numbers
        int sumPositive = 0;
        int sumNegative = 0;
        for(int i=m; i<=n; i++) {
            if(i>0)
            {
                sumPositive += i;
            }
            else
            {
                sumNegative += i;
            }
        }
        System.out.println("Sum of Positive Numbers: "+sumPositive);
        System.out.println("Sum of Negative Numbers: "+sumNegative);
    }
}
