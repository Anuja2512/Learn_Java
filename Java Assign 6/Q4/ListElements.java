import java.util.Scanner;
import java.util.*;

public class ListElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] values = new int [6];
        for(int i=0; i<6; i++)
        {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            values[i] = n;
            Arrays.sort(values, 0, i+1);
            for(int j=0; j<=i; j++)
            {
                System.out.print(values[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nRemoving the last element..\n");
        values[5] = -1;

        for(int i=0; i<5; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
    
}
