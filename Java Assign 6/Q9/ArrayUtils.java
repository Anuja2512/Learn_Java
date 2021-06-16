import java.util.Arrays;
import java.util.Random;  
import java.util.Collections;

public class ArrayUtils {

    public static void main(String[] args) {

        Random random = new Random();
        
        //creating an array
        Integer[] a = new Integer [5];

        //adding elements
        for(int i=0; i<5; i++)
        {
            a[i] = random.nextInt()%100;
        }

        //displaying elements
        for(int num: a)
        {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();

        //update value
        a[4] = 3;

        System.out.println("Updated Array:");
        for(int num: a)
        {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();

        //lets search for 3 value
        int loc = Arrays.binarySearch(a, 3);
        System.out.println("3 found at location: "+String.valueOf(loc)+"\n");

        //fill an array
        int []b = {1, 2, 3, 4, 5};

        System.out.println("Filled Array:");
        for(int num: b)
        {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();


        //Descending Sort
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Descending Sort Array:");
        for(int num: a)
        {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
