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

//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

 class ArrayUnidimensional {
    public static void main(String[] args) {
        String[] miArray = {"uno", "dos", "tres", "cuatro"};

        for (String elemento : miArray) {
            System.out.println(elemento);
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[][] miArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Recorremos el array con dos bucles for anidados
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray[i].length; j++) {
                System.out.println("Valor en [" + i + "][" + j + "]: " + miArray[i][j]);
            }
        }
    }
}





