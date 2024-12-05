/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalmudahprima;
import java.util.Scanner;
/**
 *
 * @author lenovo loq 2
 */
public class SoalMudahPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan = scanner.nextInt(); 
        int check = 0;

        for (int i = 2; i <= Math.sqrt(bilangan); i++) {
        if (bilangan % i == 0) {
            check++;
            break;
            }
        }

        if (check == 0) {
            System.out.println("Bilangan " + bilangan + " itu prima, yeay benar");
        } else {
            System.out.println("Bilangan " + bilangan + " itu bukan prima");
        }
    }
}
 

