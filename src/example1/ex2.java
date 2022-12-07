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
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir A sayısı giriniz ");
        int A = input.nextInt();
        System.out.println("lütfen bir B sayısı giriniz ");
        int B = input.nextInt();
        int toplam = A + B ;
        System.out.println("toplam:" +toplam );
    }
    
}
