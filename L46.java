interface A10
{
    void show();
}
public class L46 
{
    public static void main(String[] args) 
    {
        //method 1
        /* 
        A10 obj=new A10() 
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();
        */

        //method 2: lemda expression-only used for functionalinterface
        A10 obj=()->System.out.println("in new show");
        //A10 obj=()->{System.out.println("in new show");};

        obj.show();

    }
}
