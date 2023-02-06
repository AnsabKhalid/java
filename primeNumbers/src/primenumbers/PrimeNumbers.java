/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

/**
 *
 * @author ansab
 */

import java.io.*;

public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        int i,j;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Prime Numbers are: ");
        for(i=1; i<=num; i++) {
            for(j=2; j<=i; j++) {
                if(i%j == 0) {
                    break;
                }
            }
            if(i == j) {
                System.out.print(" "+i);
            }
        }
        
    }
    
}
