//constructor overloading
class employeee
{
    private int id;
    private String name;

    employeee()
    {
        id=0000;
        name="Username";
    }
    employeee(int id)
    {
        this.id=id;
    }
    employeee(String name)
    {
        this.name=name;
    }
    employeee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

}
public class O4 
{
    public static void main(String[] args) 
    {
        /* 
        employeee Rajan=new employeee();
        System.out.println(Rajan.getId());
        System.out.println(Rajan.getName());
        */

        /* 
        employeee Rajan=new employeee(34);
        System.out.println(Rajan.getId());
        System.out.println(Rajan.getName());
        */

        /* 
        employeee Rajan=new employeee("Kushwah Rajan");
        System.out.println(Rajan.getId());
        System.out.println(Rajan.getName());
        */
        
        employeee Rajan=new employeee(34,"Kushwah Rajan");
        System.out.println(Rajan.getId());
        System.out.println(Rajan.getName());
        
    }
}
