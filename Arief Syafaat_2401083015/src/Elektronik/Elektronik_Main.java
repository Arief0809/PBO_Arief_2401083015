package Elektronik;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Arief
 */
public class Elektronik_Main {

    public static void main(String[] args) {
        // Objek Laptop
        Laptop laptop = new Laptop();
        laptop.setMerek("ASUS");
        laptop.setTahunProduksi(2014);
        laptop.setGaransi(2);
        laptop.setUkuranLayar(13);
        laptop.setKapasitasRAM(12);
        laptop.setKapasitasSSD(500);

        // Objek Smartphone
        Smartphone smartphone = new Smartphone();
        smartphone.setMerek("Samsung");
        smartphone.setTahunProduksi(2023);
        smartphone.setGaransi(1);
        smartphone.setKapasitasBaterai(5000);
        smartphone.setJumlahKamera(4);

        // Objek Gaming
        Pc_Gaming gamingPC = new Pc_Gaming();
        gamingPC.setMerek("Alienware");
        gamingPC.setTahunProduksi(2021);
        gamingPC.setGaransi(3);
        gamingPC.setKartuGrafis("NVIDIA RTX 3080");
        gamingPC.setRefreshRate(144);
        gamingPC.setkapasitasStorage (  500);

        // Objek SmartWatch
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.setMerek("Apple");
        smartWatch.setTahunProduksi(2025);
        smartWatch.setGaransi(1);
        smartWatch.setUkuranLayar(2);
        smartWatch.setTahanAir(true);

        // Tampilkan semua data
        System.out.println("===== Laptop =====");
        System.out.println("Merek: " + laptop.getMerek());
        System.out.println("Tahun Produksi: " + laptop.getTahunProduksi());
        System.out.println("Garansi: " + laptop.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + laptop.getUkuranLayar() + " inch");
        System.out.println("Kapasitas RAM: " + laptop.getKapasitasRAM() + " GB");
        System.out.println("Kapasitas SSD: " + laptop.getkapasitasSSD() + " GB\n");
                
        System.out.println("===== Smartphone =====");
        System.out.println("Merek: " + smartphone.getMerek());
        System.out.println("Tahun Produksi: " + smartphone.getTahunProduksi());
        System.out.println("Garansi: " + smartphone.getGaransi() + " tahun");
        System.out.println("Kapasitas Baterai: " + smartphone.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera: " + smartphone.getJumlahKamera() + "\n");

        System.out.println("===== PC Gaming =====");
        System.out.println("Merek: " + gamingPC.getMerek());
        System.out.println("Tahun Produksi: " + gamingPC.getTahunProduksi());
        System.out.println("Garansi: " + gamingPC.getGaransi() + " tahun");
        System.out.println("Kartu Grafis: " + gamingPC.getKartuGrafis());
        System.out.println("Kapasitas Storage : " + gamingPC.getkapasitasStorage() + " GB");
        System.out.println("Refresh Rate: " + gamingPC.getRefreshRate() + " Hz\n");

        System.out.println("===== SmartWatch =====");
        System.out.println("Merek: " + smartWatch.getMerek());
        System.out.println("Tahun Produksi: " + smartWatch.getTahunProduksi());
        System.out.println("Garansi: " + smartWatch.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + smartWatch.getUkuranLayar() + " inch");
        System.out.println("Tahan Air: " + (smartWatch.isTahanAir() ? "Ya" : "Tidak"));
    }
}
