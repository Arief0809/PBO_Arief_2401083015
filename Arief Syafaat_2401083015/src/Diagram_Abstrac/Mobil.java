/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagram_Abstrac;

/**
 *
 * @author Arief
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String transmisi;

    public Mobil(String merk, int tahun, int jumlahPintu, String transmisi) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Transmisi: " + transmisi);
    }
}
