class Human
{
    private int age;
    private String name;

    /*
     for encapculation or data hiding... 
     we are using getter and setter method
     In getter and setter... 
     we can set a restriction (password)
     */
    public int getAge() 
    {
        return age;
    }
    /*public void setAge(int a) 
    {
        age = a;
    }*/
    public void setAge(int age) 
    {
        this.age = age;//this keyword refer to current object
    }
    public String getName() 
    {
        return name;
    }
    /*public void setName(String n) 
    {
        name = n;
    }*/
    public void setName(String name) 
    {
        this.name = name;//this keyword refer to current object
    }

}

public class L29 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("Rajan");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
