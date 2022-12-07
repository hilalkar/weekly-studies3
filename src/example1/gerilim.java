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
//
import java.util.Scanner;

public class gerilim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen direnci giriniz:");
        double R = input.nextDouble();
        System.out.println("Lütfen akımı giriniz");
        double I = input.nextDouble();
        double gerilim = I * R;
        System.out.println("gerilim:" + gerilim);

    }

}
