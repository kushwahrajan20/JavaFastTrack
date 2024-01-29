interface A12
{
    int add(int i,int j);
}

public class L48 
{
    public static void main(String[] args) 
    {
        //method-1
        /*A12 obj = new A12()
        {
            public int add(int i,int j)
            {
                return i+j;
            }
        };
        System.out.println(obj.add(9,10));
        */

        //method-2: lemda expression-only used for functionalinterface
        A12 obj=(i,j) -> i+j;
        System.out.println(obj.add(9,10));
    }
}
