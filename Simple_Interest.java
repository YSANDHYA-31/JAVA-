//Finding Simple Interest 

import java.util.*;
public class Simple_Interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input from the user

        System.out.println("Enter principle amount:");
        double principle = sc.nextDouble();
        System.out.println("Enter rate:");
        double rate = sc.nextDouble();
        System.out.println("Enter time in years:");
        int time = sc.nextInt();

        // formula for simple interest
        double Simple_interest = (principle*time*rate)/100;

        // Print the Simple interest
        System.out.printf("Simple Interest: %.2f",Simple_interest);

    }
    
}
