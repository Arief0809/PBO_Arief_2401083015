package Elektronik;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arief
 */
public class Pc_Gaming extends Elektronik {
    private String kartuGrafis;
    private int refreshRate;
    private int Storage;

    public Pc_Gaming() {}

    public String getKartuGrafis() {
        return kartuGrafis;
    }

    public void setKartuGrafis(String kartuGrafis) {
        this.kartuGrafis = kartuGrafis;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getkapasitasStorage() {
        return Storage;
    }

    public void setkapasitasStorage(int KapasitasStorage) {
        this.Storage = KapasitasStorage;
    }
    
}
