package unidad789;

import java.util.Scanner;

public class Ejercicios {

    //Dada la función:
    // public static String reverse(String texto) { }
    //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su texto: ");
        String texto = scanner.nextLine();

        System.out.println(reverse(texto));
    }
    public static String reverse (String texto) {
        StringBuilder reversed = new StringBuilder(texto);
        return reversed.reverse().toString();
    }
}

