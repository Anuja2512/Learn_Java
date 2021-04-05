class Fish{
    void display(){
        System.out.println("I have Gills.");
    }
}

class Salmon extends Fish{
    void tellName(){
        System.out.println("I am Salmon.");
        display();
    }
}

final class PinkSalmon extends Salmon{
    void tellSubSpecies(){
        tellName();
        System.out.println("Subspecies: Pink-Salmon.");
    }
}

final class SockEye extends Salmon{
    void tellSubSpecies(){
        tellName();
        System.out.println("Subspecies: SockEye-Salmon.");
    }
}

interface Aquatic{
    default void inWater()
    {
        System.out.println("I can Survive Under Water.");
    }
}

interface Terrestrial{
    default void onLand()
    {
        System.out.println("I can Survive On Land.");
    }
}

final class Amphibian implements Aquatic, Terrestrial{

    void whoAmI()
    {
       System.out.println("I'm an Amphibian.");
       inWater();
       onLand();
    }
}

class Tuna extends Fish{

    @Override
    void display()
    {
        System.out.println("I am a streamlined silver fish with large eyes, dark blue backs and spiky fins.");
    }
}

public class AllInheritances {
    
    public static void main(String[] args){
        System.out.println("");
        System.out.println("\nSingle-Level Inheritance:\n");
        Salmon s = new Salmon();
        s.tellName();
        System.out.println("");
        System.out.println("\nMulti-Level Inheritance:\n");
        PinkSalmon p = new PinkSalmon();
        p.tellSubSpecies();
        System.out.println("");
        System.out.println("\nHierarchical Inheritance:\n");
        PinkSalmon p2 = new PinkSalmon();
        SockEye s2 = new SockEye();
        p2.tellSubSpecies();
        s2.tellSubSpecies();
        System.out.println("");
        System.out.println("\nMulti-Level Inheritance:\n");
        Amphibian a = new Amphibian();
        a.whoAmI();
        System.out.println("");
        System.out.println("\nTo demonstrate the Use of Override, we'll make another class called 'Tuna' extending fish, we then over-ride the display() method.\n");
        Tuna t = new Tuna();
        t.display();
        System.out.println("");
    }
}
