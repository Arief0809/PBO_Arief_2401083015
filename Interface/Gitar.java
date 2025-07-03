/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Arief
 */
public class Gitar extends Alat_musik {
    private int jumlahSenar;

    public Gitar(String nama, int jumlahSenar) {
        super(nama, "Akustik");
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dipetik dengan " + jumlahSenar + " senar.");
    }

    @Override
    public void stem() {
        System.out.println(nama + " sedang distem manual.");
    }
}

