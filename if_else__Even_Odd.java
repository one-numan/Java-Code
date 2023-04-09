// Question Check Input Number is Even Odd
// Take the Input from User
//  Number
// print Even or Odd

import java.util.Scanner;


public class if_else__Even_Odd{
    // Defing a Class
public static void main(String args[]){
    // Main Class
    Scanner obj=new Scanner(System.in);
    // Creating Object Scanner
    int Number;
    // Create Intger Variable
    System.out.println("\n\nEnter The Number to Check Even or Odd");

    Number=obj.nextInt();
    // Taking User Input

    // Logic : Check is divisble by 2 and Equal to 0 - If its True , then its Number is Even
    if(Number%2==0)
        System.out.println("Number Is Even");
        // Printing Number is Even
    else
        // Printing Number is ODD
        System.out.println("Number Is Odd");
}
}
