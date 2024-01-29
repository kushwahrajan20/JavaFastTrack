abstract class A7
{
    public abstract void show();
    public abstract void config();
}

public class L41 
{
    public static void main(String[] args) 
    {
        A7 obj = new A7()
        {

            @Override
            public void show() 
            {
                System.out.println("in show");
            }

            @Override
            public void config() 
            {
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}
