class Student
{
    int rollno;
    String name;
    int marks;
}

public class L22 
{
    public static void main(String[] args) 
    {
        Student s1 =new Student();
        s1.rollno=1;
        s1.name="rajan";
        s1.marks=93;

        Student s2 =new Student();
        s2.rollno=2;
        s2.name="karan";
        s2.marks=83;

        Student s3 =new Student();
        s3.rollno=3;
        s3.name="jaya";
        s3.marks=90;

        System.out.println("Name\tR-No.\tMarks");
        System.out.println("----------------------");
        System.out.println(s1.name+"\t"+s1.rollno+"\t"+s1.marks);
        System.out.println(s2.name+"\t"+s2.rollno+"\t"+s2.marks);
        System.out.println(s3.name+"\t"+s3.rollno+"\t"+s3.marks);

    }
}
