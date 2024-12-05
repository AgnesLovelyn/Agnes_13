/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalsedangtabungan;

/**
 *
 * @author lenovo loq 2
 */
public class SoalSedangTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabunganBulanan = 100000; 
        int kenaikanBulanan = 20000; 
        int totalTabungan = 0; 

        for (int bulan = 1; bulan <= 24; bulan++) {
            System.out.println("Tabungan lu bulan ke-" +bulan+ ": "+tabunganBulanan);
            totalTabungan += tabunganBulanan;
            tabunganBulanan = tabunganBulanan + kenaikanBulanan; 
        }

        System.out.println("\n  Total tabungan lu selama 24 bulan nih:"+totalTabungan);
    }
}
    
    

