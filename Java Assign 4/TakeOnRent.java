import java.util.*;

class Without{

    void rate(){
        System.out.println("\nRs. 4 per Kilometre.\n");
        System.out.print("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Enter Number of days: ");
        int days = sc.nextInt();
        System.out.println("\nName: "+name);
        System.out.println("Number of Days: "+days);
    }

}

class With{
    void rate(){
        System.out.println("\nRs. 10 per Kilometre.\n");
        System.out.print("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Enter Number of days: ");
        int days = sc.nextInt();
        System.out.println("\nName: "+name);
        System.out.println("Number of Days: "+days);
    }
}

public class TakeOnRent {
    public static void takeOn()
    {
        System.out.print("\n1. With Driver. \n2. Without Driver.\n\nYour Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1)
        {
            With w = new With();
            w.rate();
        }
        else if(choice==2)
        {
            Without wo = new Without();
            wo.rate();
        }
    }
}
