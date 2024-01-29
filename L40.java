class  s1
{
    public void show()
    {
        System.out.println("in s1 show");
    }
}
/* 
class e1 extends s1
{
    public void show()
    {
        System.out.println("in e1 show");
    }
}
*/
public class L40
{
    public static void main(String[] args) 
    {
        /*trying to modify show method of s1-class */

        //method-1
        //s1 obj = new e1();
        //obj.show();

        //method-2
        s1 obj=new s1()//anonymous class
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();

    }
}
