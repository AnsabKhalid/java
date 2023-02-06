/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author ansab
 */

import java.io.*;

public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
        int x;
        
        try {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the Number");
           x = Integer.parseInt(br.readLine());
           for(int i=1; i<=x; i++) {
               for(int j=1; j<=i; j++) {
                   System.out.print("* ");
               }
                   System.out.println("");
           }
        }
        catch(Exception e) {
            System.out.println("Error: "+e);
        }
        
    }
    
}
