/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author HİLAL
 */
import java.util.Scanner;
public class celcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        System.out.println("Lütfen fahrenheit derecesi: ");
        double Fahrenheit = input.nextDouble();
        double Celcius = (Fahrenheit - 32) / 1.8 ;
        System.out.println("Celcius derecesi:" +Celcius);
    }
    
}
