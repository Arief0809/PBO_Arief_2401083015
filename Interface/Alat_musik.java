/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Arief
 */

    public abstract class Alat_musik {
    protected String nama;
    protected String jenis;

    public Alat_musik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void info() {
        System.out.println("Nama Alat Musik: " + nama);
        System.out.println("Jenis: " + jenis);
    }

    public abstract void mainkan();
    public abstract void stem();
}


