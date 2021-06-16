package Q12;
import java.util.*;

public class Banking {

    public static HashMap<Integer, AccountDetails> sortByValue(HashMap<Integer, AccountDetails> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, AccountDetails> > list =
               new LinkedList<Map.Entry<Integer, AccountDetails> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, AccountDetails> >() {
            public int compare(Map.Entry<Integer, AccountDetails> o1,
                               Map.Entry<Integer, AccountDetails> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, AccountDetails> temp = new LinkedHashMap<Integer, AccountDetails>();
        for (Map.Entry<Integer, AccountDetails> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        HashMap<Integer, AccountDetails> m = new HashMap<Integer, AccountDetails>();

        m.put(1001, new AccountDetails("Ben", "Awad", "03/01/1995", 450));
        m.put(1002, new AccountDetails("Benji", "Ketchum", "04/01/1995", 550));
        m.put(1003, new AccountDetails("Benjamin", "Franklin", "06/017/1997", 150));
        m.put(1004, new AccountDetails("Kevin", "De Bruyne", "13/08/1992", 1450));
        m.put(1005, new AccountDetails("Oscar", "Minguenza", "07/04/2005", 550));

        HashMap<Integer, AccountDetails> m2 = sortByValue(m);

        System.out.println("\nSorted by Available Balance:\n");

        for (HashMap.Entry<Integer, AccountDetails> entry : m2.entrySet())
        {  
            System.out.println("Account No: " + String.valueOf(entry.getKey()) + " " + "Name: " + entry.getValue().fname+" "+entry.getValue().lname + " " + String.valueOf(entry.getValue().availableBalance));   
        }   
    }
}
