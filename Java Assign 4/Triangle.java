import java.util.*;
public class Triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Enter the 3 Angles of Triangle --");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a+b+c != 180)
        {
            System.out.println("Triangle not possible.");
        }
        else if(a==90 || b==90 || c==90)
        {
            if(a==0 || b==0 || c==0)
            {
                System.out.println("Triangle not possible.");
            }
            else
            {
                System.out.println("Right Angled Triangle.");
            }
        }
        else if(a<90 && b<90 && c<90)
        {
            System.out.println("Acute Angled Triangle.");
        }
        else
        {
            System.out.println("Obtuse Angled Triangle.");
        }
    }
}
