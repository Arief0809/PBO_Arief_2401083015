/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis;

/**
 *
 * @author Arief
 */
public class Silinder {
    private double r;
    private double tinggi;

    public Silinder() {
        this.r = 1.0;
        this.tinggi = 1.0;
    }

    public Silinder(double r, double tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getR() {
        return this.r;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public double getLuas() {
        return Math.PI * r * r;
    }

    public double getVolume() {
        return getLuas() * tinggi;
    }

    @Override
    public String toString() {
        return String.format("Silinder dengan radius: %.2f\nTinggi: %.2f\nLuas alas: %.2f\nVolume: %.2f",
                r, tinggi, getLuas(), getVolume());
    }

    public static void main(String[] args) {
        Silinder s1 = new Silinder();
        Silinder s2 = new Silinder(3.0, 7.0);

        System.out.println(s1);
        System.out.println(s2);

        s1.setR(2.5);
        s1.setTinggi(5.0);
        System.out.println("\nSetelah nilai diubah:");
        System.out.println(s1);
    }
}
