public class L25 
{
    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer("Rajan");
        System.out.println(sb.capacity());
        sb.append(" Kushwah");
        System.out.println(sb.capacity());
        System.out.println(sb.toString());  //sb.toString = sb
        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.insert(6, " java ");
        System.out.println(sb);
    }
}
