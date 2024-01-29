enum Status
{
    Running,Failed,Pending,Success;
}

public class L44 
{
    public static void main(String[] args) 
    {
        Status s1= Status.Running;
        System.out.println(s1);


        Status s2= Status.Running;
        System.out.println(s2.ordinal());


        Status [] s3= Status.values();
        for (Status st : s3) 
        {
            System.out.println(st+"\t"+st.ordinal());
        }

        
        Status s = Status.Running;
        switch (s) 
        {
            case Running:
                System.out.println("All Good");
                break;
        
            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please wait");
                break;

            default:
                System.out.println("Done");
            
        }

    }
}
