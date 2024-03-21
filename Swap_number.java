import java.util.Scanner;

class Swap_number{
public static void main(String args[]){
	Scanner obj= new Scanner(System.in);
	int a,b;
	System.out.println("Enter the Value of A");
	a=obj.nextInt();
	System.out.println("Enter The Value of B");
	b=obj.nextInt();
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("A is "+a+"B is "+b);
	}
}
