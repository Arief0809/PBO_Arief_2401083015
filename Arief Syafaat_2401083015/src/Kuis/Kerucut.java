/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis;

/**
 *
 * @author Arief
 */
public class Kerucut {
    private double r;      
    private double tinggi;

    public Kerucut() {
        this.r = 1.0;       
        this.tinggi = 1.0;
    }

    // Konstruktor dengan parameter
    public Kerucut(double r, double tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }

    // Setter untuk jari-jari
    public void setR(double r) {
        this.r = r;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Getter untuk jari-jari
    public double getR() {
        return this.r;
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return this.tinggi;
    }

    // Menghitung luas alas (lingkaran)
    public double getLuas() {
        return Math.PI * r * r;
    }

    // Menghitung volume kerucut
    public double getVolume() {
        return (1.0 / 3.0) * getLuas() * tinggi;
    }

    // Representasi objek dalam bentuk string
    @Override
    public String toString() {
        return String.format("Kerucut dengan jari-jari: %.2f\nTinggi: %.2f\nLuas alas: %.2f\nVolume: %.2f",
                r, tinggi, getLuas(), getVolume());
    }

    public static void main(String[] args) {
        // Uji coba kelas Kerucut
        Kerucut k1 = new Kerucut();
        Kerucut k2 = new Kerucut(3.0, 6.0);

        System.out.println(k1);
        System.out.println(k2);

        k1.setR(4.0);
        k1.setTinggi(8.0);
        System.out.println("\nSetelah nilai diubah:");
        System.out.println(k1);
    }
}
