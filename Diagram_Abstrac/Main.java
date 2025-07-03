/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Diagram_Abstrac;

/**
 *
 * @author Arief
 */
public class Main {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2022, 4, "Automatic");
        Motor motor = new Motor("Yamaha", 2021, "Full-face", 150);

        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();

        System.out.println();

        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
        motor.matikan();
    }
}
