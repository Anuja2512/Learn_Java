package Q11;
import java.util.*;

public class Students {

    public static void main(String[] args) {
        
        ArrayList<StudentData> students = new ArrayList<StudentData>();

        //adding students
        students.add(new StudentData(1, 8, "Devang", "CSE", "AB"));
        students.add(new StudentData(2, 7, "Anuja", "IT", "BC"));
        students.add(new StudentData(3, 10, "Lalu", "CSE", "AA"));
        students.add(new StudentData(4, 8, "Sanjay", "ENTC", "AB"));
        students.add(new StudentData(5, 9, "Aayush", "Graphics", "AA"));

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
