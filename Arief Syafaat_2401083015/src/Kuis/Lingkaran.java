/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis;

/**
 *
 * @author Arief
 */
public class Lingkaran {
    private double r;

    public Lingkaran() {
        this.r = 1.0;
    }

    public Lingkaran(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getDiameter() {
        return 2 * r;
    }

    public double getKeliling() {
        return 2 * Math.PI * r;
    }

    public double getLuas() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return String.format("Lingkaran dengan radius: %.2f\nDiameter: %.2f\nKeliling: %.2f\nLuas: %.2f",
                r, getDiameter(), getKeliling(), getLuas());
    }

    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran(5.0);

        System.out.println(l1);
        System.out.println(l2);

        l1.setR(3.0);
        System.out.println("\nSetelah diubah radiusnya:");
        System.out.println(l1);
    }
}