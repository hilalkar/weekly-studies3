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

public class enerji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cismin kütlesini m giriniz:");
        double m = input.nextDouble();

        System.out.println("Lütfen cismin hızını V giriniz:");
        double V = input.nextDouble();

        System.out.println("Lütfen cismin yerden yüksekliğini h giriniz:");
        double h = input.nextDouble();

        System.out.println("Lütfen cismin yer çekimi ivmesini g giriniz:");
        double g = input.nextDouble();
        double kinetik = (m * Math.pow(V, 2)) / 2;
        double potansiyel = (m * g * h);
        System.out.println("cimin kinetik enerjisi:" + kinetik);
        System.out.println("cismin potansiyel enerjisi:" + potansiyel);
                
    }

}


   
