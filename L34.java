class  A3 
{
    public void show()
    {
        System.out.println("in A show");
    }

    public void config()
    {
        System.out.println("in A config");
    }
}

class B3 extends A3
{
    @Override
    public void show()
    {
        System.out.println("in B show");
    }
}

public class L34 
{
    public static void main(String[] args) 
    {
        B3 obj = new B3();
        obj.show();
        obj.config();;
    }
}
