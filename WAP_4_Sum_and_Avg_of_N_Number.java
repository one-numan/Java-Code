import java.util.Scanner;
class Sum_and_Avg_of_N_Number{
    public static void main(String args[])
    {   
        Scanner obj=new Scanner(System.in);
        int i,n;
        float elemens,sum=0,avg=0;
        System.out.println("Enter the Length of Elements");
        n=obj.nextInt();
        for(i=1;i<=n;i++)
            {
                elemens=obj.nextInt();
                sum=sum+elemens;
            }
        avg=sum/n;
        System.out.println("All Element Sum :"+sum+"\nAverage is :"+avg);
    }
}