/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyek_Besar_PBO;

/**
 *
 * @author Arief
 */
public class Square extends Rectangle {

    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    // ⬇️ Tambahkan constructor ini
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public String toString() {
        return "Square[side=" + getSide() + ", " + super.toString() + "]";
    }
}