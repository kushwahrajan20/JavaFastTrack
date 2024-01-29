// class - class ---> extends
//class - interface --> implement
//interface - interface ---> extends


interface A8
{
    int age=44;             //variables are static or final
    String area="Mumbai";

   void show();
   void config(); 
}

interface  X
{
    void run();
} 

interface Y extends X
{

}

class  B8 implements A8,X
{

    @Override
    public void config() 
    {
        System.out.println("in show");
    }

    @Override
    public void show() 
    {
        System.out.println("in config");
    }

    @Override
    public void run() 
    {
        System.out.println("running...");
    }
    
}

public class L42 
{
    public static void main(String[] args) 
    {
        A8 obj;
        obj=new B8();
        obj.show();
        obj.config();
        
        X obj1=new B8();
        obj1.run();
    }
}
