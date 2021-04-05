class Lawyer{
    protected String almaMater = "Harvard";
}

class PearsonHardman extends Lawyer{
    private String workingUnder = "Louis Litt";

    public void display()
    {
        System.out.println("Works Under "+workingUnder);
    }
}

final class Associate extends PearsonHardman{
    public void showWhereYouWork()
    {
        System.out.println("Works at: The Bullpen.");
    }
}

public class Demonstrate {

    public static void main(String[] args)
    {
        Associate a = new Associate();
        System.out.println("Alumni of: "+a.almaMater);
        a.display();
        a.showWhereYouWork();
    }
    
}
