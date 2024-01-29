
class A4
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B4 extends A4
{
    public void show()
    {
        System.out.println("in B show");
    }
}

class C4 extends A4
{
    public void show()
    {
        System.out.println("in C show");
    }
}

public class L35 
{
    public static void main(String[] args) 
    {
        // super obj = new sub ---> valid
        // sub obj = new super ---> invalid
        /*
        - we can use method of super class
        - cannot use method of sub  class
        - if a method is available in sub and super both 
          then sub class method will be called
        */
        
        A4 obj = new A4();
        obj.show();

        obj = new B4();
        obj.show();

        obj = new C4();
        obj.show();
    }
}
