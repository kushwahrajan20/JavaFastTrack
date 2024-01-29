interface Computerr
{
    void code();
}

class Laptopp implements Computerr
{
    public void code()
    {
        System.out.println("CODE,COMPILE,RUN,...slower");
    }
}

class Desktop implements Computerr
{
    public void code()
    {
        System.out.println("CODE,COMPILE,RUN,...faster");
    }
}

class Developer
{
    public void devApp(Computerr comp)
    {
        comp.code();
    }
}

public class L43 
{
    public static void main(String[] args) 
    {
        Computerr lap=new Laptopp();
        Computerr desk=new Desktop();
        Developer Rajan = new Developer();
        Rajan.devApp(lap);
        Rajan.devApp(desk);

    }
}
