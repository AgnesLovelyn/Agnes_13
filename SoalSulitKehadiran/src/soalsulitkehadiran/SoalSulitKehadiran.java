/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalsulitkehadiran;
import java.util.Scanner;
/**
 *
 * @author lenovo loq 2
 */
public class SoalSulitKehadiran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ada berapa sih jumlah siswanya: ");
        int jumlahSiswa = scanner.nextInt();

        int[] hariHadir = new int[jumlahSiswa];
        int totalHariHadir = 0;
        int hariKerja = 24;
        
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("ada berapa hari siswa ke-" + (i + 1) + " hadir selama sebulan: ");
            hariHadir[i] = scanner.nextInt();
            totalHariHadir += hariHadir[i];
        }

        double rataRata = (double) totalHariHadir / jumlahSiswa;

        System.out.println("Rekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: " + hariKerja + " hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + hariHadir[i] + " hari hadir");
        }
 
        System.out.println("Rata-rata kehadiran siswa: " + rataRata);

        System.out.println("Kesimpulan:");
        System.out.println("- Siswa rajin yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        scanner.close();
    }
}
    
    

