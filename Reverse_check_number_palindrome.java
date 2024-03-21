
import java.util.Scanner;
// Taking Input for Importing Module

public class reverse_check_number_palindrome{
//     Creating Main Class
  
    public static void main(String args[]){
//       Main Class
        int reverse=0,number,original_number;
//       define Variable
        Scanner obj=new Scanner(System.in);
//       Creating Input Object
        System.out.println("\n Enter the number to check its reverse number is equal or not ");
        number=obj.nextInt();
//       Taking Input
        original_number=number;
//       Storing Original Value
      
//       Main Logic 
        while(number!=0)
        {
            
            reverse=reverse * 10;
            reverse=reverse + number % 10 ;
            number=number / 10;
        }
//       Comparing Orginal Value to Reverse Value
        if(original_number == reverse)

            System.out.println(reverse+" Reverse number is Equal to "+original_number+" Original Number\n");

        else
            System.out.println(reverse+" Reverse Number is not Equal to "+original_number+" Original number\n");
        }
}

