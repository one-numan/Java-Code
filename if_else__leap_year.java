// Question Check Insert Year Is Leap Year Or not
// Take the Input from User 
//  Check Input integer is Leap Year Or Not


import java.util.Scanner;
    public class if_else__leap_year{ //Class Name
        public static void main(String args[]){
            // int year;
            Scanner obj=new Scanner(System.in);//Scanner class for taking input
            System.out.println("\n Enter The year to check its leap year or not");
            int year=obj.nextInt(); // taking input
            if((year%400==0)||(year%4==0)) //apply  OR condition to check 
            System.out.println(year+" its is a leap Year");
            else 
            System.out.println(year+" its not a leap year");

        }
    }