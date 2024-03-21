// import java.util.Scanner;
// 
// public class All_if_else{
//     public static void main(String args[]){

//     int cp,sp;
//     Scanner obj=new Scanner(System.in);

//     System.out.println("\n\nEnter the Cost Price");
//     cp=obj.nextInt();

//     System.out.println("\nEnter the Selling Price");
//     sp=obj.nextInt();

//     if(cp>sp)
//         System.out.println("Your are In Lose "+(cp-sp));
//     else if(sp>cp)
//         System.out.println("You are In Profit "+(sp-cp));
//     else
//         System.out.println("No loss No profile");
//     }
// }





// import java.util.Scanner;

// public class All_if_else{
// public static void main(String args[]){
    
//     Scanner obj=new Scanner(System.in);
//     int Number;
//     System.out.println("\n\nEnter The Number to Check Even or Odd");
//     Number=obj.nextInt();
//     if(Number%2==0)
//         System.out.println("Number Is Even");
//     else
//         System.out.println("Number Is Odd");
// }
// }


// import java.util.Scanner;
//     public class All_if_else{ //Class Name
//         public static void main(String args[]){
//             // int year;
//             Scanner obj=new Scanner(System.in);//Scanner class for taking input
//             System.out.println("\n Enter The year to check its leap year or not");
//             int year=obj.nextInt(); // taking input
//             if((year%400==0)||(year%4==0)) //apply  OR condition to check 
//             System.out.println(year+" its is a leap Year");
//             else 
//             System.out.println(year+" its not a leap year");

//         }
//     }



// import java.util.Scanner;
// public class All_if_else{
//     public static void main(String args[]){
//         int reverse=0,number,original_number;
//         Scanner obj=new Scanner(System.in);
//         System.out.println("\n Enter the number to check its reverse number is equal or not ");
//         number=obj.nextInt();
//         original_number=number;
//         while(number!=0)
//         {
//             reverse=reverse * 10;
//             reverse=reverse + number % 10 ;
//             number=number / 10;
//         }
//         if(original_number == reverse)
//             System.out.println(reverse+" Reverse number is Equal to "+original_number+" Original Number\n");
//         else
//             System.out.println(reverse+" Reverse Number is not Equal to "+original_number+" Original number\n");
//         double k=20.0,y=09.0;
//         float d=k/y;
//             System.out.println(d);
//         }
// }








import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class All_if_else {



//     private static final Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         int N = scanner.nextInt();
//         if(N%2==0){
            
//             if((N<2)&&( N>5)){
//                 System.out.println("Not Weird");
//         }
//         else if((N<6)&&(N>20)){
//             System.out.println("Weird");
//         }
//         else if(N>20)
//         {   System.out.println("Not Weird");
//     }
// }
// else{
    
//     System.out.println("Weird");
// }
// String s= scanner.nextLine();
// scanner.close();
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    
    double d = scan.nextDouble(); 
    String s = scan.nextInt();

    // Write your code here.

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
}
}



































