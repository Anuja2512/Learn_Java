interface Lawyer{
    void designation();
}

public class Associate implements Lawyer{

    public void designation()
    {
        System.out.println("Designation: Associate");
    }

    public static void main(String[] args)
    {
        Lawyer l = new Associate();
        l.designation();
    }

}