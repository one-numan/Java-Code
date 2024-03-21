import java.util.Scanner; 
class sum_n_term{
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        int number,k;
        float sum=0;
        System.out.print("Enter The Length of Number");
        number=obj.nextInt();
        System.out.print("Enter The Element :\n");
        for(int i=1;i<=number;i++)
        {
            k=obj.nextInt();
            sum=sum+k;
        }
    System.out.println("\n "+number+" Sum is "+sum); 
    }   
} 