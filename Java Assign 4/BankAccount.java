import java.util.*;
public class BankAccount {
    
    public String depositorName, type;
    public int accountNumber, accountBalance; 

    BankAccount(String depositorName, String type, int accountNumber, int accountBalance)
    {
        this.depositorName = depositorName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
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
        System.out.println("Current Bank Balance is "+this.accountBalance);
    }

    public static void main(String[] args) {

        System.out.println("\n-- Bank Account --\n\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter Account Balance: ");
        int bal = sc.nextInt();

        BankAccount b = new BankAccount(name, type, accNum, bal);
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
        //Display
        b.displayAmount();
        System.out.println();
    }

}
