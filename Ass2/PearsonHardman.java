interface LawyerPH{
    String degree="Bachelor of Law";
    void whatCollege();
}

interface AssociatePH{
    String firm = "Pearson Hardman";
    void whereToWork();
}

class PearsonHardman implements LawyerPH, AssociatePH{

    public void whatCollege()
    {
        System.out.println("College: Harvard University.");
    }

    public void whereToWork()
    {
        System.out.println("Work at: The Bullpen.");
    }

    public static void main(String[] args)
    {
        LawyerPH p = new PearsonHardman();
        AssociatePH k  = new PearsonHardman();
        p.whatCollege();
        k.whereToWork();
    }
    
}
