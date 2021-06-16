import java.util.*;

public class StudentDetails implements Comparable<StudentDetails>{

    String name;
    int jeeScore, tenthScore, twelfthScore;

    StudentDetails(String name, int jeeScore, int tenthScore, int twelfthScore)
    {
        this.name = name;
        this.jeeScore = jeeScore;
        this.tenthScore = tenthScore;
        this.twelfthScore = twelfthScore;
    }

    public int compareTo(StudentDetails st){  
        if(st.jeeScore > this.jeeScore)
        {
            return 1;
        }
        else if(st.jeeScore < this.jeeScore)
        {
            return -1;
        }
        else
        {
            if(st.twelfthScore > this.twelfthScore)
            {
                return 1;
            }
            else if(st.twelfthScore < this.twelfthScore)
            {
                return -1;
            }
            else
            {
                if(st.tenthScore > this.tenthScore)
                {
                    return 1;
                }
                else if(st.tenthScore < this.tenthScore)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        }
    }  
}