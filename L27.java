class Mobile1
{
    String brand;
    int price;
    static String name;

    public Mobile1()
    {
        brand="";
        price=200;
        System.out.println("in constuctor block");
    }

    /*
    static block-
    it will call only once irrespective of no of object created
    */
    static
    {
        name = "Phone";
        System.out.println("in static block");
    }



    public void show()
    {
        System.out.println(brand+"\t"+price+"\t"+name);
    }
}

public class L27
{
    public static void main(String[] args) 
    {
        System.out.println("in main ");
        //Mobile1 obj1=new Mobile1();
        //Mobile1 obj2=new Mobile1();
    }
}
