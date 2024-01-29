class computer
{
    public void playMusic()
    {
        System.out.println("playing music...");
    }

    public String getPen(int cost)
    {
        if(cost>=10)
        {        
          return "Pen";
        }    
        else
        {
            return "Nothing";
        }
    }
}

public class L17 
{
    public static void main(String[] args) 
    {
        computer com=new computer();

        com.playMusic();
        String str=com.getPen(11);
        System.out.println(str);
    }
}
