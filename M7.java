public class M7 
{
    /* 
    //atleast one argument required
    public static int sum(int x,int...arr)
    {
        int sum=0;
        for(int a:arr)
        {
            sum+=a;
        }
        return sum;
    }
    */


    public static int sum(int...arr)
    {
        int sum=0;
        for(int a:arr)
        {
            sum+=a;
        }
        return sum;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(sum(10,39,45,66,35,2,4,5,333,33,22,9));
    }
}
