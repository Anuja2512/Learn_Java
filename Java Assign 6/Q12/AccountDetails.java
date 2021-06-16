package Q12;
public class AccountDetails implements Comparable<AccountDetails> {
    
    String fname, lname, dob;
    int availableBalance;

    AccountDetails(String fname, String lname, String dob, int availableBalance)
    {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.availableBalance = availableBalance;
    }

    public int compareTo(AccountDetails ad)
    {
        if(ad.availableBalance > this.availableBalance)
        {
            return 1;
        }
        else if(ad.availableBalance < this.availableBalance)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}