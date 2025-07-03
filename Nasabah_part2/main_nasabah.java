/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Nasabah_part2;

/**
 *
 * @author Arief Syafaat_2401083015
 */
public class main_nasabah {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Bank bank = new Bank();

        bank.tambahNasabah("Vlamidir", "Putin", new Tabungan(500000));
        bank.tambahNasabah("Donald", "Trump", new Tabungan(750000));

        System.out.println("Jumlah Nasabah: " + bank.getJumlahNasabah());

        // Menampilkan semua nasabah di bank
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            Nasabah nasabah = bank.getNasabah(i);
            System.out.println("Nasabah: " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir() + ", Saldo: " + nasabah.getTabungan().getSaldo());
        }
    }
}
