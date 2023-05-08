package unidad789;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;
import java.util.*;

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
// Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

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
// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

class vector {
    public static void main(String[] args) {
        Vector<String> miVector = new Vector<String>();

        // Añadimos elementos al vector
        miVector.add("Elemento 1");
        miVector.add("Elemento 2");
        miVector.add("Elemento 3");
        miVector.add("Elemento 4");
        miVector.add("Elemento 5");

        // Eliminamos el segundo y tercer elemento
        miVector.remove(2);
        miVector.remove(2);

        // Mostramos el resultado final
        for (String elemento : miVector) {
            System.out.println(elemento);
        }
        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        System.out.println("Desperdiciamos mucha memoria del sistema, ya que cada vez que se sobrepasa" +
                " el limite establecido (Por defecto, 10) la dimension del vector se duplica.");
    }
}

//Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
//        Recorre ambos mostrando únicamente el valor de cada elemento.

class EjemploArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> miArrayList = new ArrayList<String>();
        miArrayList.add("uno");
        miArrayList.add("dos");
        miArrayList.add("tres");
        miArrayList.add("cuatro");

        LinkedList<String> miLinkedList = new LinkedList<String>(miArrayList);

        System.out.println("Valores del Arraylist");
        for (String valor : miArrayList) {
            System.out.println(valor);
        }

        System.out.println("\nValores de la LinkedList:");
        for (String valor: miLinkedList) {
            System.out.println(valor);
        }
    }
}

//Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.
// Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.


class ArrayListEjemplo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Rellenamos la lista con elementos del 1 al 10
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Eliminamos los números pares
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }

        // Mostramos el ArrayList final
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

// Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
// Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

class DividePorCero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int num2 = sc.nextInt();

        try {
            int resultado = divide(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero");
        } else {
            return num1 / num2;
        }
    }
}

// Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

class FileCopy {
    public static void copy(String fileIn, String fileOut) throws IOException {
        FileInputStream in = new FileInputStream(fileIn);
        FileOutputStream out = new FileOutputStream(fileOut);
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = in.read(buffer)) != -1) {
            out.write(buffer, 0,bytesRead);
        }
        in.close();
        out.close();
    }
}

// Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

class FormulaUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream ps = System.out;
        Map<String, String> pilotos = new HashMap<>();
        String[] carreras = new String[10];
        int contadorCarreras = 0;

        try {
            ps.println("Introduce el nombre del piloto:");
            String nombrePiloto = sc.nextLine();
            ps.println("Introduce el equipo del piloto:");
            String equipoPiloto = sc.nextLine();
            pilotos.put(nombrePiloto, equipoPiloto);

            ps.println("Introduce el nombre de la carrera:");
            String nombreCarrera = sc.nextLine();
            carreras[contadorCarreras] = nombreCarrera;
            contadorCarreras++;

            ps.println("Datos del piloto:");
            ps.println(pilotos.get(nombrePiloto));
            ps.println("Carreras:");
            for (int i = 0; i < contadorCarreras; i++) {
                ps.println(carreras[i]);
            }

            // Imprime los elementos que contenga la lista
            ps.println("Elementos de la lista:");
            ps.println(Arrays.toString(carreras));
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}









