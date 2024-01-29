
class calculator1
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public double add(double a,int b)
    {
        return a+b;
    }
}

public class L18
{
    public static void main(String[] args) 
    {
        calculator1 cl=new calculator1();
        int r1=cl.add(10, 20);
        int r2=cl.add(10, 20,30);
        double r3=cl.add(10.00, 20);
        System.out.println(r1);        
        System.out.println(r2);
        System.out.println(r3);
    }
}
