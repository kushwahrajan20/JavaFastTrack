public class L4 
{
    public static void main(String[] args) 
    {
        //integer literals
        int num1=0b101;     //binary
        int num2=0237;      //octal
        int num3=23445;     //decimal
        int num4=0x34E;     //hexadecimal
        int num5=100_000_00;//easy to count zeros

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        //double literals
        double d1=34;
        double d2=12e10;

        System.out.println(d1);
        System.out.println(d2);

        //character literals
        char c='a';
        c++;
        System.out.println(c);
    }
}
