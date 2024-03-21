import java.util.Scanner;
// Import Scanner Module
class Swap_two_number{
//   Create Main Class
  public static void main(String args[]){
    // Create Main Class
	  Scanner obj= new Scanner(System.in);
    // Create Input Scanner
	  int a,b;
	  System.out.println("Enter the Value of A");
    // First Input Integer
	  a=obj.nextInt();
	  System.out.println("Enter The Value of B");
	  b=obj.nextInt();
    // Second Input Integer
    
    // Swap Logic | using temp variable
	  int temp;
	  temp=a;
	  a=b;
	  b=temp;
	  System.out.println("A is "+a+"B is "+b);
	}
}
