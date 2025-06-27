/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Arief
 */
public class Keyboard extends Alat_musik implements Perangkat {
    public boolean DayaTersambung;

    public Keyboard(String nama) {
        super(nama, "Elektronik");
        this.DayaTersambung = false;
    }

    @Override
    public void nyalakan() {
        DayaTersambung = true;
        System.out.println(nama + " dinyalakan.");
    }

    @Override
    public void matikan() {
        DayaTersambung = false;
        System.out.println(nama + " dimatikan.");
    }

    @Override
    public boolean cekListrik() {
        return DayaTersambung;
    }

    @Override
    public void mainkan() {
        if (cekListrik()) {
            System.out.println(nama + " dimainkan dengan suara piano.");
        } else {
            System.out.println(nama + " tidak bisa dimainkan karena tidak ada daya.");
        }
    }

    @Override
    public void stem() {
        System.out.println(nama + " sedang distem secara digital.");
    }
}
