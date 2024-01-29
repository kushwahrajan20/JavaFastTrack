class calculator
{
    int a;

    public int add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
}

public class L16 
{
    public static void main(String[] args) 
    {
        int num1=34;
        int num2=11;
        calculator cal=new calculator();
        int result=cal.add(num1,num2);
        System.out.println(result);
    }
}
