import java.util.*;

public class OlaCab {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-- Ola Cabs --\n\n");
        System.out.println("Choose your Action:");
        System.out.println("1. Inquiry.");
        System.out.println("2. Take on Rent.");
        System.out.println("3. Estimate Fare.");
        System.out.println("4. Feedback.");
        System.out.println();
        
        System.out.print("Your Choice: ");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            Inquiry i = new Inquiry();
            i.enquire();
        }
        else if(choice == 2)
        {
            TakeOnRent t = new TakeOnRent();
            t.takeOn();
        }
        else if(choice == 3)
        {
            EstimateRent e = new EstimateRent();
            e.estimate();
        }
        else if(choice == 4)
        {
            Feedback f = new Feedback();
            f.feedback();
        }
    }

}
