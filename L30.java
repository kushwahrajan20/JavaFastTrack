class Human1
{
    private int age;
    private String name;

    /*
     constuctor is a method 
     constuctor having same name as class name 
     constuctor will be excute after creating object of class without calling it.
     */
    public Human1()     //default constuctor
    {
        age=12;
        name="Username";
    }

    public Human1(int age,String name)  //parameterized constructor
    {
        this.age=age;
        this.name=name;
    }

    public int getAge()  //parameterized constructor
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

}

public class L30
{
    public static void main(String[] args) 
    {
        Human1 obj = new Human1();
        
        //Human1 obj = new Human1(10,"Mess");
        //for parameterized constuctor

        /*
        let's create constructor to set 
        default value of age and name something else 
        */

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        obj.setAge(18);
        obj.setName("Rajan");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
