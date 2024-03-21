import java.util.Scanner;
class numan{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of the A");
        int a=input.nextInt();
        System.out.println("Your ENter the value "+a);

       while(a!=29){
           System.out.println(a++);
       }
    }
}