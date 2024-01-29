class A1
{
    public A1()
    {
        System.out.println("Object created");
    }

    public void show()
    {
        System.out.println("in A show");
    }
}

public class L32 
{
    public static void main(String[] args) 
    {
        //A1 obj;         //Anonymous object
        //obj=new A1();

        new A1().show();  
        //using this we have created object and used once
        //after this we can not use same object
    }
}
