public class M6 
{
    static void changeArr(int [] arr,int index,int changeTo)
    {
        arr[index]=changeTo;
    }
    public static void main(String[] args) 
    {
        int[] Marks={93,82,79,99,87,78};
        changeArr(Marks,3,95);
        System.out.println(Marks[3]);
    }
}
