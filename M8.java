public class M8 
{
    static int fact(int n)
    {
        if(n==1)
            return 1;

        return n*fact(n-1); 
    }
    public static void main(String[] args) 
    {
        System.out.println(fact(3));
        System.out.println(fact(4));
        System.out.println(fact(5));
        System.out.println(fact(6));
        System.out.println(fact(7));
        System.out.println(fact(8));
    }
}
