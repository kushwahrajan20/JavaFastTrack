
class InnerM2 
{
    public int logic(int x, int y)
    {
        int z;
        if(x>y)
         z=x-y;
        else
         z=y-x;

        return z;
    }
}

public class M2
{
    public static void main(String[] args) 
    {
        InnerM2 obj=new InnerM2();
        int a = 10;
        int b = 6;
        int c;
        c = obj.logic(a,b);
        System.out.println(c);
    }
}
