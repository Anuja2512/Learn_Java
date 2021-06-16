package Q14;
import java.util.*;

public class Students {

    public static Boolean checkUnique(ArrayList<StudentData> students, StudentData sd)
    {
        for(StudentData student: students)
        {
            if(student.rollNumber == sd.rollNumber)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        ArrayList<StudentData> students = new ArrayList<StudentData>();

        //adding students
        StudentData sd = new StudentData(1, 8, "Devang", "CSE", "AB");
        if(checkUnique(students, sd) == false)
        {
            System.out.println("Values have to be unique.");
            return;
        }
        students.add(sd);
        sd = new StudentData(2, 7, "Anuja", "IT", "BC");
        if(checkUnique(students, sd) == false)
        {
            System.out.println("Values have to be unique.");
            return;
        }
        students.add(sd);
        sd = new StudentData(3, 9, "Lalu", "CSE", "AB");
        if(checkUnique(students, sd) == false)
        {
            System.out.println("Values have to be unique.");
            return;
        }
        students.add(sd);
        sd = new StudentData(4, 8, "Sanjay", "ENTC", "AB");
        if(checkUnique(students, sd) == false)
        {
            System.out.println("Values have to be unique.");
            return;
        }
        students.add(sd);
        sd = new StudentData(5, 9, "Aayush", "Graphics", "AA");
        if(checkUnique(students, sd) == false)
        {
            System.out.println("Values have to be unique.");
            return;
        }
        students.add(sd);

        //sort
        Collections.sort(students);

        System.out.println("\nSorted ArrayList\n");
        for(StudentData student: students)
        {
            System.out.println(student.name + " " + String.valueOf(student.grade));
        }
        System.out.println();

        //search
        //Search for roll number 4

        for(StudentData student: students)
        {
            if(student.rollNumber == 4)
            {
                System.out.println(student.name + " " + String.valueOf(student.grade) + " " + String.valueOf(student.rollNumber));
            }
        }

    }
}
