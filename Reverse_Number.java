// Reverese the given number 

// Input: 1234     Output: 4321
// Input: -120     Output: -21    
// Conditions: It ignores 0 at the last, and the negative(-) sign should precede the number

import java.util.*;
public class Reverse_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = sc.nextInt();
        int rem, rev = 0;
        while(N != 0){
            rem = N%10;
            rev = (rev*10)+rem;
            N = N/10;
        }
        System.out.println("Reversed Number: ");
        System.out.println(rev);
    }
    
}
