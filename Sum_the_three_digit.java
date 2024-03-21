import java.util.Scanner;
class Sum_the_three_digit
{
    public static void main(String arg[])
    {
        Scanner obj = new  Scanner (System.in);
        int a,b,c,d;
        System.out.println("Enter the value of a,b,c");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
      //main Logic
      d=a+b+c;
      System.out.println(d);
    }
}
