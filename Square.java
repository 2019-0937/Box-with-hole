
package square;

import java.util.Scanner;

public class Square {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int s = 10;
      
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
               if(i==0||i==s-1||j==0||j==s-1){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               } 
            }
            System.out.println();
        }
    }
    
}
