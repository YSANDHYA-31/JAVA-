/* Input: 1

   Output:
   
   * * * * * 
   * * * * 
   * * * 
   * * 
   * 

*/


import java.util.*;
public class Pattern_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=5; i>=N; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            
    }
}
    

