class A
{
    public A()
    {
        super();
        System.out.println("in A");
    }

    public A(int a)
    {
        super();
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    
    public B(int b)
    {
        //this();       //it will call default constructor of same class(class-B)
        super(b);       //call default constructor of parent class(class-A)
        System.out.println("in B int");
    }

}

public class L31 
{
    public static void main(String[] args) 
    {
        //B b=new B();
        //B c=new B(10);

    }
}
