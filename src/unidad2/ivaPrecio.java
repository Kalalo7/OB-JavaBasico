package unidad2;

import java.util.Scanner;

public class ivaPrecio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio sin IVA: ");
        double precio = scanner.nextDouble();
        double precioConIva = calcularIva(precio);
        System.out.println("El precio con IVA es: " + precioConIva);
    }

    public static double calcularIva(double precio) {
        double iva = 0.21; // 21%
        double precioConIva = precio * (1 + iva);
        return precioConIva;
    }
}