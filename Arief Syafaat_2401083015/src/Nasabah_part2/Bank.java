/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nasabah_part2;

/**
 *
 * @author Arief Syafaat_2401083015
 */
class Bank {
    private final Nasabah[] nasabah;
    private int jumlahNasabah;

    public Bank() {
        nasabah = new Nasabah[100];
        jumlahNasabah = 0;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        jumlahNasabah++;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir, Tabungan tabungan) {
        nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir, tabungan);
        jumlahNasabah++;
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        if (indeks >= 0 && indeks < jumlahNasabah) {
            return nasabah[indeks];
        }
        return null;
    }

    public int searchNasabah(String namaAwal, String namaAkhir) {
        for (int i = 0; i < jumlahNasabah; i++) {
            if (nasabah[i].getNamaAwal().equalsIgnoreCase(namaAwal) && 
                nasabah[i].getNamaAkhir().equalsIgnoreCase(namaAkhir)) {
                return i;
            }
        }
        return -1;
    }

    public int searchNasabah(Nasabah nasabah) {
        for (int i = 0; i < jumlahNasabah; i++) {
            if (this.nasabah[i] == nasabah) {
                return i;
            }
        }
        return -1;
    }

    public int searchNasabah(String namaAwal) {
        for (int i = 0; i < jumlahNasabah; i++) {
            if (nasabah[i].getNamaAwal().equalsIgnoreCase(namaAwal)) {
                return i;
            }
        }
        return -1;
    }
}
