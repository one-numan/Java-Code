// Question Check Profit or Loss
// Take the Input from User
//  Cost Price
// Return How much profit or loss or no profit or no loss

import java.util.Scanner;
// Import this function for taking User Input

public class All_if_else{
    // Create Class
    public static void main(String args[]){
    // Main Function

    int cp,sp;
    // Create Two Integer Varaible 
    Scanner obj=new Scanner(System.in);
    // Creating a New Object that is scanner

    System.out.println("\n\nEnter the Cost Price in Int");
    cp=obj.nextInt();
    // Taking Input of Cost Price

    System.out.println("\nEnter the Selling Price in Int");
    sp=obj.nextInt();
    // Taking Input of Selling Price

    // Using Logic - Conditional Stmt If Else ladder
    if(cp>sp)
        // IF Cost price is More than Selling Price 
        // Its Loss
        System.out.println("Your are In Lose "+(cp-sp));
        // Printing the Output , How much Loss
    else if(sp>cp)
        // IF Selling Price is more than COST
        // Its Profit
        System.out.println("You are In Profit "+(sp-cp));
        // Printing the Output ,How much
    else
        // IF No Condition is Satisfied that means 
        // NO Profit No Loss
        System.out.println("No Profit No Loss");
    }
}
