class mobile
{
    String brand;
    int price;
    static String name;
    // static ---> common/shared for all objects
    // final  ---> cannot be changed

    public void show()
    {
        System.out.println(brand+"\t"+price+"\t"+name);
    }
}

public class L26 
{
    public static void main(String[] args) 
    {
        mobile obj1=new mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        mobile.name="xyz";            //static variable set by using class name not object name
        //obj1.name="smart phone";    //setting name of mobie for both object

        mobile obj2=new mobile();
        obj2.brand="samsung";
        obj2.price=1700;

        obj1.show();
        obj2.show();

        //obj2.name="phone";          //setting name of mobile for both object
        obj1.show();
        obj2.show();


    }
}
