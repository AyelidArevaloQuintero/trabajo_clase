import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10) + 1; // Genera del 1 al 10
        }

        System.out.println("Número  \t Cuadrado  \t Cubo");
        for (int i = 0; i < vector.length; i++) {
            int numero = vector[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero  + " \t" +   cuadrado  + " \t" +  cubo );
        }
    }
}
