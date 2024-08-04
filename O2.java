//Private access modifier - getter and setter

class MyEmployee 
{
    private int id;
    private String name;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}

public class O2 
{
    public static void main(String[] args) 
    {
        MyEmployee Rajan = new MyEmployee();
        Rajan.setId(1234);
        Rajan.setName("Kushwah Rajan");
        
        System.out.println(Rajan.getId());
        System.out.println(Rajan.getName());
        
    }
}
