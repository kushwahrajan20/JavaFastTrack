public class L8 
{
    public static void main(String[] args) 
    {
        // Assignment operators
            int f = 7;
            System.out.println("f += 3: " + (f += 3));
            System.out.println("f -= 2: " + (f -= 2));
            System.out.println("f *= 4: " + (f *= 4));
            System.out.println("f /= 3: " + (f /= 3));
            System.out.println("f %= 2: " + (f %= 2));
            System.out.println("f &= 0b1010: " + (f &= 0b1010));
            System.out.println("f |= 0b1100: " + (f |= 0b1100));
            System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
            System.out.println("f <<= 2: " + (f <<= 2));
            System.out.println("f >>= 1: " + (f >>= 1));
            System.out.println("f >>>= 1: " + (f >>>= 1));
        
        // Comparison operators
            int a = 10;
            int b = 3;
            int c = 5;
                         
            System.out.println("a > b: " + (a > b));
            System.out.println("a < b: " + (a < b));
            System.out.println("a >= b: " + (a >= b));
            System.out.println("a <= b: " + (a <= b));
            System.out.println("a == c: " + (a == c));
            System.out.println("a != c: " + (a != c));
                
    }
}
