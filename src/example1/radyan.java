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
public class radyan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI=3.14;
        Scanner input= new Scanner (System.in);
        System.out.println("Lütfen dereceyi(C) giriniz");
        double C= input.nextDouble();
        double radyan= C/180*PI;
        double gradyan= C*200/180;
        System.out.println("Radyan:" + radyan);
        System.out.println("gradyan:" +gradyan );
                
        
        
    }
    
}
