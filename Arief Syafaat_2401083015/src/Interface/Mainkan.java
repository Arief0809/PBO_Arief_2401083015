/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interface;

/**
 *
 * @author Arief
 */
public class Mainkan {
    public static void main(String[] args) {
        Keyboard kbd = new Keyboard("Yamaha PSR-E373");
        kbd.info();
        kbd.nyalakan();
        kbd.mainkan();
        kbd.stem();
        kbd.matikan();

        System.out.println();

        Gitar gitar = new Gitar("Fender Acoustic", 6);
        gitar.info();
        gitar.mainkan();
        gitar.stem();
    }
}
