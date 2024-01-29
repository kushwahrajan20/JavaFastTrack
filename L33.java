
public class L33 
{
    public static void main(String[] args) 
    {
        Calc obj=new Calc();
        int r1=obj.add(10, 20);
        int r2=obj.sub(10, 20);
        
        System.out.println(r1+"\t"+r2);


        AdvCalc obj1=new AdvCalc();
        int A1=obj1.add(10, 20);
        int A2=obj1.sub(10, 20);
        int A3=obj1.multi(10, 20);
        int A4=obj1.div(10, 20);
        
        System.out.println(A1+"\t"+A2+"\t"+A3+"\t"+A4);

        IncAdvCalc obj2=new IncAdvCalc();
        int I1=obj2.add(10, 20);
        int I2=obj2.sub(10, 20);
        int I3=obj2.multi(10, 20);
        int I4=obj2.div(10, 20);
        double I5=obj2.power(1, 20);
        
        System.out.println(I1+"\t"+I2+"\t"+I3+"\t"+I4+"\t"+I5);

    }
}
