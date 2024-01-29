public class L6 
{
    public static void main(String[] args) 
    {
        int a=257;

        byte b;
        b=(byte)a;
        //equivalent to 257 % 256
        //it will give remainder if value of 'a' is 'out of range' of byte
        
        System.out.println(b);
    }
}
