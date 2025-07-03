/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Nasabah_part1;

/**
 *
 * @author Arief Syafaat_2401083015
 */
public class main_nasabah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nasabah nasabah1 = new Nasabah("Donald", "Trump");
        Nasabah nasabah2 = new Nasabah("Vlamidir", "Putin");

        Tabungan tab1 = new Tabungan(500000);
        Tabungan tab2 = new Tabungan(300000);

        nasabah1.setTabungan(tab1);
        nasabah2.setTabungan(tab2);

        System.out.println(nasabah1);
        System.out.println(nasabah2);

        // Transfer uang
        boolean berhasil = nasabah1.getTabungan().transfer(nasabah2.getTabungan(), 200000);
        System.out.println("Transfer Berhasil: " + berhasil);

        System.out.println(nasabah1);
        System.out.println(nasabah2);
    }
}
