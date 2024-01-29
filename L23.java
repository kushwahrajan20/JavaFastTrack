class student1
{
    int rollno;
    String name;
    int marks;
}

public class L23
{
    public static void main(String[] args) 
    {
        student1 s[]=new student1[3];
        s[0].rollno=1;
        s[0].name="rajan";
        s[0].marks=93;

        s[1].rollno=2;
        s[1].name="karan";
        s[1].marks=83;

        s[2].rollno=3;
        s[2].name="jaya";
        s[2].marks=90;

        for (student1 st : s) 
        {
            System.out.println(st.name+"\t"+st.rollno+"\t"+st.marks);
        }
    }
}
