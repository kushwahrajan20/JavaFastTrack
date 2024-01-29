public class L20 
{
    public static void main(String[] args) 
    {
        int num[][]=new int[3][4];

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                num[i][j]=(int)(Math.random()*10);
            }
        }

        for (int i[] : num)
        {
            for (int j : i) 
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
