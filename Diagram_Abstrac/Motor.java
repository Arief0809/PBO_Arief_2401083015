/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagram_Abstrac;

/**
 *
 * @author Arief
 */
public class Motor extends Kendaraan {
    private String jenisHelm;
    private int cc;

    public Motor(String merk, int tahun, String jenisHelm, int cc) {
        super(merk, tahun);
        this.jenisHelm = jenisHelm;
        this.cc = cc;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jenis Helm: " + jenisHelm);
        System.out.println("Kapasitas Mesin: " + cc + "cc");
    }
}
