public class M1 
{
    public static int logic(int x, int y)
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
        int a = 10;
        int b = 6;
        int c;
        c = logic(a,b);
        System.out.println(c);
    }
}
