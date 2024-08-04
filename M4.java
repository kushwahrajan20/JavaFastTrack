public class M4 
{
    static void tellJoke()
    {
        System.out.println("With no argument .... Chal nikal , yaha se!");
    }
    static void tellJoke(int x)
    {
        System.out.println("With int Argument "+x+" .... Chal nikal , yaha se!");
    }
    static void tellJoke(String s)
    {
        System.out.println("With String Argument "+s+" .... Chal nikal , yaha se!");
    }

    public static void main(String[] args) 
    {
        tellJoke(100);
        tellJoke("Hello");
        tellJoke();
    }
}
