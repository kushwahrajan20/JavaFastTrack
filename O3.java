//Constructor - object banate hi excute ho jata hai

class employe
{
    private int id;
    private String name;

    employe()
    {
        id=0000;
        name="Username";
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

}

public class O3 
{
    public static void main(String[] args) 
    {
        employe Rajan = new employe();

        System.out.println("-----Defalt values-----");
        System.out.println(Rajan.getId());
        System.out.println(Rajan.getName());

        Rajan.setId(1234);
        Rajan.setName("Kushwah Rajan");
        System.out.println("-----Changed Values-----");
        System.out.println(Rajan.getId());
        System.out.println(Rajan.getName());
    }
}
