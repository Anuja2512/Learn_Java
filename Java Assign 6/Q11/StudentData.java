package Q11;
public class StudentData implements Comparable<StudentData> {

    int rollNumber, pointer;
    String name, branch, grade;

    StudentData(int rollNumber, int pointer, String name, String branch, String grade)
    {
        this.rollNumber = rollNumber;
        this.pointer = pointer;
        this.name = name;
        this.branch = branch;
        this.grade = grade;
    }

    public int compareTo(StudentData sd)
    {
        return this.grade.compareTo(sd.grade);
    }
}