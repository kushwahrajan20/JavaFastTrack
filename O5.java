//Inheritance

class Base
{
    int x;
    public int getX() {return x;}
    public void setX(int x) {System.out.println("setting x now... ");;this.x = x;}
    public void printMe() {System.out.println("");}
}

class Derived extends Base 
{
    int y;
    public int getY() {return y;}
    public void setY(int y) {this.y = y;};
}

public class O5 
{
    public static void main(String[] args) 
    {
        
    } 
}
