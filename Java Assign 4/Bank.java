import java.util.*;

class BankingAccount{

    public String depositorName, type;
    public int accountBalance;
    public UUID accountNumber;
    
    BankingAccount(String depositorName, String type, int accountBalance)
    {
        this.depositorName = depositorName;
        this.accountBalance = accountBalance;
        //random generation
        UUID uuid = UUID.randomUUID();
        this.accountNumber = uuid;
        this.type = type;
    }

    public void depositAmount(int amount)
    {
        this.accountBalance += amount;
        System.out.println("New Account Balance is: "+this.accountBalance);
    }

    public void withdrawAmount(int amount)
    {
        if(this.accountBalance >= amount)
        {
            this.accountBalance -= amount;
            System.out.println("New Account Balance is: "+this.accountBalance);
        }
        else
        {
            System.out.println("Not enough Balance.");
        }
    }

    public void displayAmount()
    {
        System.out.println("Account Number is "+this.accountNumber);
        System.out.println("Account Type is "+this.type);
        System.out.println("Current Bank Balance is "+this.accountBalance);
    }

    public void checkPenalty()
    {
        if(this.accountBalance < 1000)
        {
            System.out.println("\nKindly add minimum balance to your account (Rs. 1000)");
        }
        else
        {
            System.out.println("\nNo penalty for your account.");
        }
    }

    public void interest()
    {
        // 5% interest
        this.accountBalance += (accountBalance/20);
        System.out.println("New Bank Balance is "+this.accountBalance);
    }
}

public class Bank {
    public static void main(String[] args) {

        // create new account
        System.out.println("\n-- Bank Account --\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Account Balance: ");
        int bal = sc.nextInt();

        BankingAccount b = new BankingAccount(name, type, bal);
        System.out.println();

        //Deposit
        System.out.print("Enter Amount to Deposit: ");
        int amt = sc.nextInt();
        b.depositAmount(amt);
        System.out.println();

        //Withdraw
        System.out.print("Enter Amount to Withdraw: ");
        int amt2 = sc.nextInt();
        b.withdrawAmount(amt2);
        System.out.println();

        //Check Penalty
        b.checkPenalty();
        System.out.println();

        //Add up Interest
        b.interest();
        System.out.println();

        //Display
        b.displayAmount();
        System.out.println();
    }    
}
