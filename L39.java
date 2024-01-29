class  A6 
{
    public void show()
    {
        System.out.println("in A show");
    }

    class B6
    {    
        public void config()
        {
            System.out.println("in A config");
        }
    }
}


public class L39
{
    public static void main(String[] args) 
    {
        A6 obj = new A6();
        obj.show();

        A6.B6 obj1= obj.new B6();
        obj1.config();
    }
}
