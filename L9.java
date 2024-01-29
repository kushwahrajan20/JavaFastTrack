public class L9 
{
    public static void main(String[] args) 
    {
        // Logical operators
            boolean x = true;
            boolean y = false;
       
            System.out.println("x && y: " + (x && y));
            System.out.println("x || y: " + (x || y));
            System.out.println("!x: " + (!x));

        // Bitwise operators
            int d = 0b1010;
            int e = 0b1100;

            System.out.println("d & e: " + (d & e));
            System.out.println("d | e: " + (d | e));
            System.out.println("d ^ e: " + (d ^ e));
            System.out.println("~d: " + (~d));
            System.out.println("d << 2: " + (d << 2));
            System.out.println("e >> 1: " + (e >> 1));
            System.out.println("e >>> 1: " + (e >>> 1));
        
        //Shift Operators
            int a = 10;
            // using left shift
            System.out.println("a<<1 : " + (a << 1));
            // using right shift
            System.out.println("a>>1 : " + (a >> 1));  
    }
}
