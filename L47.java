interface A11
{
    void show(int i);
}
public class L47
{
    public static void main(String[] args) 
    {
        //method 1
        /* 
        A11 obj=new A11() 
        {
            public void show(int i)
            {
                System.out.println("in new show "+i);
            }
        };
        obj.show(11);
        */

        //method 2: lemda expression-only used for functionalinterface
        A11 obj=(i)->System.out.println("in new show "+i);
        obj.show(11);


    }
}
