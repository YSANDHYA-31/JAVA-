// Fibanocci Series
// first = 0
// second = 1 (next)
// 1 + 1 -> second + next = 2
// 1 + 2 = 3
// 2 + 3 = 5
// 3 + 5 = 8 and so on

import java.util.*;
public class Fibanocci_Series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Read input from the user
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int first_term = 0;  // first fibanocci number
        int second_term = 1; // second fibanocci number
        int next_term;
            
        System.out.print("The fibanocci series upto " + N + " : ");
        for(int i=1;i<=N;i++){

            System.out.print(first_term + " ");
            next_term = first_term + second_term;  // calculate next term
            first_term = second_term;              // update first term
            second_term = next_term;               // update second term
        }
    }
}
