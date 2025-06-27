/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nasabah_part1;

/**
 *
 * @author Arief Syafaat_2401083015
 */
public class Tabungan {
    private int saldo;

    // Konstruktor
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    // Getter untuk saldo
    public int getSaldo() {
        return saldo;
    }

    // Menyimpan uang ke saldo
    public void simpanUang(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    // Mengambil uang dari saldo
    public boolean ambilUang(int jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    // Transfer saldo ke tabungan lain
    public boolean transfer(Tabungan t, int jumlah) {
        if (ambilUang(jumlah)) {
            t.simpanUang(jumlah);
            return true;
        }
        return false;
    }
}
