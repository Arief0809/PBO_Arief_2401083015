/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java 
 */
package Kuis;

/**
 * @author Arief
 */
import java.util.Scanner;

public class KuisMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ==Pilihlah objek dibawah== :");
        System.out.println("1. Lingkaran");
        System.out.println("2. Silinder");
        System.out.println("3. Kerucut");
        System.out.println("=============================");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                // Lingkaran
                System.out.println("Masukkan jari-jari lingkaran:");
                double rLingkaran = scanner.nextDouble();

                Lingkaran lingkaran = new Lingkaran(rLingkaran);
                System.out.println("\nDetail Lingkaran:");
                System.out.println(lingkaran.toString());
                break;
                
            case 2:
                // Silinder
                System.out.println("Masukkan jari-jari silinder:");
                double rSilinder = scanner.nextDouble();
                System.out.println("Masukkan tinggi silinder:");
                double tinggiSilinder = scanner.nextDouble();

                Silinder silinder = new Silinder(rSilinder, tinggiSilinder);
                System.out.println("\nDetail Silinder:");
                System.out.println(silinder.toString());
                break;
                
            case 3:
                // Kerucut
                System.out.println("Masukkan jari-jari kerucut:");
                double rKerucut = scanner.nextDouble();
                System.out.println("Masukkan tinggi kerucut:");
                double tinggiKerucut = scanner.nextDouble();

                Kerucut kerucut = new Kerucut(rKerucut, tinggiKerucut);
                System.out.println("\nDetail Kerucut:");
                System.out.println(kerucut.toString());
                break;

            default:
                System.out.println("Pilihan tak tampil. Program selesai."); 
        }
    }
}