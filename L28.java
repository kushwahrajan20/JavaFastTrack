class Mobile2
{
    String brand;
    int price;
    static String name;

    public Mobile2()
    {
        brand="";
        price=200;
    }

    /*
    static block-
    it will call only once irrespective of no of object created
    */
    static
    {
        name = "Phone";
    }



    public void show()
    {
        System.out.println(brand+"\t"+price+"\t"+name);
    }

    public static void show1(Mobile2 obj)
    {
        System.out.println(obj.brand+"\t"+obj.price+"\t"+name);
    }
}

public class L28
{
    public static void main(String[] args) 
    {
        Mobile2 obj1=new Mobile2();
        obj1.brand="Apple";
        obj1.price=15;

        Mobile2 obj2=new Mobile2();
        obj2.brand="samsung";
        obj2.price=1700;

        Mobile2.show1(obj1);//calling show method using class name
    }
}
