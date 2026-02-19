// Even or Odd Numbers using Switch case

// Input 1: 3       Output 1: 3 is an Odd Number
// Input 2: 88      Output 2: 88 is an Even Number

import java.util.*;
public class Even_or_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        
        System.out.print("Enter Positive Number: ");
        int choice = sc.nextInt();

        // By using switch case find the given number is even or odd

        switch(choice % 2){

            case 0:
                System.out.println(choice + " is an Even Number.");
                break;  // break is used to exit the loop once the condition is satisfied.

            default:
                System.out.println(choice + " is an Odd Number.");
        }
    }
    
}
