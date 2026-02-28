/* Printing Week Days using Switch Case
   Input: Enter the week day no: 5
   Output: Friday
*/
import java.util.*;
public class Week_Days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week day no: ");

        // read the N value
        int N = sc.nextInt();
        
        switch(N){
            // Using modern switch expression (Java 14+)
            case 1 -> System.out.println("Monday");  
            case 2 -> System.out.println("Tuesday");   
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

            // Executes if input is not between 1 and 7
            default -> System.out.println("Invalid Number");
        }
    }
    
}
