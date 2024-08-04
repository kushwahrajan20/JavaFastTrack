class Employee
{
    int id;
    String name;

    public void printDetails()
    {
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
    }
}

public class O1 
{
    public static void main(String[] args) 
    {
        Employee Rajan = new Employee();

        //setting attributes
        Rajan.id=1234;
        Rajan.name="Kushwah Rajan";

        /* 
        //pring details 
        System.out.println(Rajan.id);
        System.out.println(Rajan.name);
        */

        Rajan.printDetails();

    }
}
