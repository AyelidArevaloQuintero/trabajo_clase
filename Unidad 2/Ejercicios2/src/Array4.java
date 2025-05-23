import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector = new int[10];
        int contador = 0;

        while (contador < vector.length) {
            System.out.print("Ingresa un número: ");
            int numero = input.nextInt();

            if (numero < 0) {
                break;
            }

            vector[contador] = numero;
            contador++;
        }

        System.out.println("\nElementos ingresados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }

        input.close();
    }
}
