import java.util.*;

public class StudentEntry {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentDetails> s = new ArrayList<StudentDetails>();
        
        int n;
        System.out.print("Enter number of Students: ");
        n = sc.nextInt();

        System.out.println();
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            name = sc.nextLine();
            System.out.print("Enter 10th Score: ");
            int tenthScore = sc.nextInt();
            System.out.print("Enter 12th Score: ");
            int twelfthScore = sc.nextInt();
            System.out.print("Enter JEE Score: ");
            int jeeScore = sc.nextInt();
            System.out.println();
            
            int c=0;
            for(StudentDetails student: s)
            {
                if(student.name.equals(name))
                {
                    c++;
                    break;
                }
            }
            if(c>0)
            {
                System.out.println("Name Already Exists. Try Again.");
                i--;
            }
            else
            {
                StudentDetails stu = new StudentDetails(name, jeeScore, tenthScore, twelfthScore);
                s.add(stu);
            }
        }

        //Sorting in descending order
        Collections.sort(s);  

        for(StudentDetails student: s)
        {
            String jee = String.valueOf(student.jeeScore);
            String tenth = String.valueOf(student.tenthScore);
            String twelfth = String.valueOf(student.twelfthScore);
            System.out.println(student.name + " " + jee + " " + tenth + " " + twelfth);
        }
    }

}
