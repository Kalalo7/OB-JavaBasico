package unidad3;

public class concatenar {
    public static void main(String[] args) {
        String[] nombres = {"Martin", "María", "Lucas", "Maia"};
        String resultado = "";

        for (int i = 0; i < nombres.length; i++) {
            resultado += nombres[i] + " ";
        }

        System.out.println("El resultado final es: " + resultado);
    }
}
