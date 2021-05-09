import java.lang.Math;
public class Inquiry {
    public static void enquire()
    {
        System.out.println("\nAvailable Modes: ");
        System.out.println("SUV - "+(int)(Math.random()*100));
        System.out.println("Sedan - "+(int)(Math.random()*100));
        System.out.println();
    }
}