// Sum of N numbers

// Input = 5        Output = 15  
// Explanation: 1+2+3+4+5 = 15

import java.util.*;
public class Sum_of_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        
        // Initialize Sum to 0
        int Sum = 0;
        
        // Using for loop to iterate over the sequence
        for(int i=1 ; i<=N ; i++){
            Sum += i;
        }
        System.out.print("The Sum of " + N + " numbers is: " );
        System.out.println(Sum);
    }
}
