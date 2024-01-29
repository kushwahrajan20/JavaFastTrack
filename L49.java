public class L49 
{
    public static void main(String[] args) 
    {
        int i=0;
        int j=0;
        int num[]=new int[5];

        try 
        {
            j=18/i;
            System.out.println(num[1]);
            System.out.println(num[5]);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Cannot divid eby zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit"+e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("End");
    }

}
