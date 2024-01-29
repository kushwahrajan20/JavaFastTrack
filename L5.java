public class L5 
{
    public static void main(String[] args) 
    {
        byte b1=127;
        int a1=12;

        byte b2;
        int a2;

        b2=(byte)a1;    //narrow type casting
        a2=b1;          //widening type casting

        System.out.println(b2);
        System.out.println(a2);
        System.out.println((int)12.789);

    }
}
