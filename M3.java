public class M3
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
    public static void main(String[] args) 
    {
        M3 obj=new M3();
        int a = 10;
        int b = 6;
        int c;
        c = obj.logic(a,b);
        System.out.println(c);
    }
}
