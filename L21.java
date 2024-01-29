public class L21 
{
    public static void main(String[] args) 
    {
        /*jagged array*/
        int num[][]=new int[3][];   //no. of row fixed
        num[0]=new int[3];          //no. of coloum in row-0
        num[1]=new int[4];          //no. of coloum in row-1
        num[2]=new int[2];          //no. of coloum in row-2

        for (int i = 0; i < num.length; i++) 
        {
            for (int j = 0; j < num[i].length; j++) 
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

