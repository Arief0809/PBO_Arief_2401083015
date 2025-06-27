/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagram_Abstrac;

/**
 *
 * @author Arief
 */
public class Kendaraan {
    protected String merk;
    protected int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public void nyalakan() {
        System.out.println(merk + " dinyalakan.");
    }

    public void matikan() {
        System.out.println(merk + " dimatikan.");
    }

    public void periksaKondisi() {
        System.out.println("Memeriksa kondisi " + merk + "." );
    }

    public void servis() {
        System.out.println("Melakukan servis pada " + merk + ".");
    }

    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}
