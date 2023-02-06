/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlearea;

/**
 *
 * @author ansab
 */

import java.io.*;
import java.lang.*;

public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=0;
            try {
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Enter Radius of Circle: ");
              x = Integer.parseInt(br.readLine());
              double area = Math.PI*x*x;
              System.out.println("Circle of Area: "+area );
              double perimeter = 2*Math.PI*x;
              System.out.println("Perimeter of Circle: "+perimeter);
            }  
            catch(Exception e) {
                System.out.println("Error: "+ e);
            }
        
    }
    
}
