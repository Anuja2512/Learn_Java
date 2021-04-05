/*
Write a program to handle stock of a wholesale grocery shop using
interface. Maintain available stock of dairy product, wafers, vegetables,
beverages separately. Check the current demand by customers and place
an order if stock is not sufficient. Update the stock accordingly. Interface
includes all common methods also stock information is related to interface
//not individual class assume that grocery shop handle only limited orders.
*/
import java.util.*;

interface CommodityStock{

    void getCurrentStock();
    void soldSomeStock(int quantity);
    void boughtSomeStock(int quantity);
    int returnStock();

}

class DairyProducts implements CommodityStock{

    public int amount = 1000;

    public void getCurrentStock()
    {
        System.out.println("Current Stock of Dairy Products: "+amount);
    }
    public void soldSomeStock(int quantity)
    {
        amount -= quantity;
        System.out.println("Dairy Products Stock Updated.");
    }
    public void boughtSomeStock(int quantity)
    {
        amount += quantity;
        System.out.println("Dairy Products Stock Updated.");
    }
    public int returnStock()
    {
        return amount;
    }

}

class Wafers implements CommodityStock{

    public int amount = 1000;

    public void getCurrentStock()
    {
        System.out.println("Current Stock of Wafers: "+amount);
    }
    public void soldSomeStock(int quantity)
    {
        amount -= quantity;
        System.out.println("Wafers Stock Updated.");
    }
    public void boughtSomeStock(int quantity)
    {
        amount += quantity;
        System.out.println("Wafers Stock Updated.");
    }
    public int returnStock()
    {
        return amount;
    }

}

class Vegetables implements CommodityStock{

    public int amount = 1000;

    public void getCurrentStock()
    {
        System.out.println("Current Stock of Vegetables: "+amount);
    }
    public void soldSomeStock(int quantity)
    {
        amount -= quantity;
        System.out.println("Vegetables Stock Updated.");
    }
    public void boughtSomeStock(int quantity)
    {
        amount += quantity;
        System.out.println("Vegetables Stock Updated.");
    }
    public int returnStock()
    {
        return amount;
    }

}

class Beverages implements CommodityStock{

    public int amount = 1000;

    public void getCurrentStock()
    {
        System.out.println("Current Stock of Beverages: "+amount);
    }
    public void soldSomeStock(int quantity)
    {
        amount -= quantity;
        System.out.println("Beverages Stock Updated.");
    }
    public void boughtSomeStock(int quantity)
    {
        amount += quantity;
        System.out.println("Beverages Stock Updated.");
    }
    public int returnStock()
    {
        return amount;
    }

}

public class GroceryShop {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CommodityStock d = new DairyProducts();
        CommodityStock w = new Wafers();
        CommodityStock v = new Vegetables();
        CommodityStock b = new Beverages();

        System.out.println("Grocery Shop Stock:\n");

        while(true)
        {
            System.out.println("Your Action: \n1. Get Stock.\n2. Sold a Product.\n3. Bought some Stock.\n4. Get All Stock.\n0. Exit.\n");
            System.out.print("Your Choice: ");
            int choice = sc.nextInt();
            if(choice == 0)
            {
                break;
            }
            if(choice == 1)
            {
                System.out.println("Which Commodity:\n1. Dairy Products.\n2. Wafers.\n3. Vegetables.\n4. Beverages.\n");
                System.out.print("Your Choice: ");
                int choice2 = sc.nextInt();
                if(choice2 == 1)
                {
                    d.getCurrentStock();
                }
                if(choice2 == 2)
                {
                    w.getCurrentStock();
                }
                if(choice2 == 3)
                {
                    v.getCurrentStock();
                }
                if(choice2 == 4)
                {
                    b.getCurrentStock();
                }
            }
            if(choice == 2)
            {
                System.out.println("Which Commodity:\n1. Dairy Products.\n2. Wafers.\n3. Vegetables.\n4. Beverages.\n");
                System.out.print("Your Choice: ");
                int choice2 = sc.nextInt();
                if(choice2 == 1)
                {
                    System.out.print("Enter the Quantity: ");
                    int amt = sc.nextInt();
                    if(amt > d.returnStock())
                    {
                        System.out.println("Insufficient Stock.");
                    }
                    else
                    {
                        d.soldSomeStock(amt);
                    }
                }
                if(choice2 == 2)
                {
                    System.out.print("Enter the Quantity: ");
                    int amt = sc.nextInt();
                    if(amt > w.returnStock())
                    {
                        System.out.println("Insufficient Stock.");
                    }
                    else
                    {
                        w.soldSomeStock(amt);
                    }
                }
                if(choice2 == 3)
                {
                    System.out.print("Enter the Quantity: ");
                    int amt = sc.nextInt();
                    if(amt > v.returnStock())
                    {
                        System.out.println("Insufficient Stock.");
                    }
                    else
                    {
                        v.soldSomeStock(amt);
                    }
                }
                if(choice2 == 4)
                {
                    System.out.print("Enter the Quantity: ");
                    int amt = sc.nextInt();
                    if(amt > b.returnStock())
                    {
                        System.out.println("Insufficient Stock.");
                    }
                    else
                    {
                        b.soldSomeStock(amt);
                    }
                }
            }
            if(choice == 3)
            {
                System.out.println("Which Commodity:\n1. Dairy Products.\n2. Wafers.\n3. Vegetables.\n4. Beverages.\n");
                System.out.print("Your Choice: ");
                int choice2 = sc.nextInt();
                if(choice2 == 1)
                {
                    System.out.print("Enter the Quantity: ");
                    int amt = sc.nextInt();
                    d.boughtSomeStock(amt);
                }
                if(choice2 == 2)
                {
                    System.out.print("Enter the Quantity: ");
                    int amt = sc.nextInt();
                    w.boughtSomeStock(amt);
                }
                if(choice2 == 3)
                {
                    System.out.print("Enter the Quantity: ");
                    int amt = sc.nextInt();
                    v.boughtSomeStock(amt);
                }
                if(choice2 == 4)
                {
                    System.out.print("Enter the Quantity: ");
                    int amt = sc.nextInt();
                    b.boughtSomeStock(amt);
                }
            }
            if(choice == 4)
            {
                System.out.println("All Commodities: ");
                System.out.println("Diary Products:");
                d.getCurrentStock();
                System.out.println("Wafers:");
                w.getCurrentStock();
                System.out.println("Vegetables:");
                v.getCurrentStock();
                System.out.println("Beverages:");
                b.getCurrentStock();
            }
            System.out.println("");
        }
    }
}
