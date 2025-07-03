/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyek_Besar_PBO_part2;

/**
 *
 * @author Arief
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Circle
        Circle circle = new Circle(2.5, "blue", false);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        // Membuat objek Rectangle
        Rectangle rectangle = new Rectangle(4.0, 5.0, "green", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

        // Membuat objek Square
        Square square = new Square(3.0, "yellow", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println();

        // Uji polymorphism
        Shape s1 = new Circle(1.5, "purple", true);
        Shape s2 = new Rectangle(2.0, 3.0, "orange", false);
        Shape s3 = new Square(4.0, "black", true);

        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println();

        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());
        System.out.println();

        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
    }
}

