enum lapps
{
    
    Macbook(2000),XPS(2200),Surface,T_Pad(2500);

    private int price;

    private lapps() 
    {
        price = 500;
    }

    private lapps(int price) 
    {
        this.price = price;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

}

public class L45 
{
    public static void main(String[] args) 
    {
        for(lapps lap : lapps.values())
        {
            System.out.println(lap+"\t"+lap.getPrice());
        }
    }
}
