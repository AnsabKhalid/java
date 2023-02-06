/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidtriangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ansab
 */
public class PyramidTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int x;
        
        try {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the Number");
           x = Integer.parseInt(br.readLine());
            // loop to iterate for the given number of rows
        for (int i = 1; i <= x; i++) {
  
            // loop to print the number of spaces before the star
            for (int j = x; j >= i; j--) {
                System.out.print(" ");
            }
  
            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
  
            // for new line after printing each row
            System.out.println();
        }
        }
        catch(Exception e) {
            System.out.println("Error: "+e);
        }
        
    }
    
}
