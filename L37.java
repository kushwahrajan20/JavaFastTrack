class A5
{
    public void show1()
    {
        System.out.println("in A show");
    }
}

class B5 extends A5
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class L37 
{
    public static void main(String[] args) 
    {
        A5 obj = new B5();  //down casting
        obj.show1();

        B5 obj1=(B5) obj;   //up casting
        obj1.show2();
    }
}
