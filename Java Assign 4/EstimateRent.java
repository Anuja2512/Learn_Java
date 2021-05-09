import java.util.*;

class WithoutDriver{

    void rate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRs. 4 per Kilometre.\n");
        System.out.print("Enter Number of Kms: ");
        int kms = sc.nextInt();
        System.out.println("Estimated Cost: "+(kms*4));
    }
}

class WithDriver{
    void rate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRs. 10 per Kilometre.\n");
        System.out.print("Enter Number of Kms: ");
        int kms = sc.nextInt();
        System.out.println("Estimated Cost: "+(kms*10));
    }
}

public class EstimateRent {

    public static void estimate()
    {
        System.out.print("\n1. With Driver. \n2. Without Driver.\n\nYour Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1)
        {
            WithDriver w = new WithDriver();
            w.rate();
        }
        else if(choice==2)
        {
            WithoutDriver wo = new WithoutDriver();
            wo.rate();
        }
    }    
}
