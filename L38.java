abstract class Car  
{
    public abstract void drive();

    public abstract void fly();

    public void playMusic()
    {
        System.out.println("playing music...");
    }
}

abstract class WagonR extends Car
{
    
    public void drive()
    {
        System.out.println("driving...");
    }
}

class UpdateWagonR extends WagonR
{
    public void fly()
    {
        System.out.println("flying...");
    }
}

public class L38 
{
    public static void main(String[] args) 
    {
        Car obj =new UpdateWagonR();
        //we can not create object of abstract class
        obj.drive();
        obj.playMusic();
    }
}
