import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] temperaturas = new double[5][2];

        for (int i = 0; i < 5; i++) {
            System.out.print("Día " + (i + 1) + " - Temperatura mínima: ");
            temperaturas[i][0] = input.nextDouble();
            System.out.print("Día " + (i + 1) + " - Temperatura máxima: ");
            temperaturas[i][1] = input.nextDouble();
        }

        System.out.println("\nTemperatura media por día:");
        for (int i = 0; i < 5; i++) {
            double media = (temperaturas[i][0] + temperaturas[i][1]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media);
        }

        double minTemp = temperaturas[0][0];
        for (int i = 1; i < 5; i++) {
            if (temperaturas[i][0] < minTemp) {
                minTemp = temperaturas[i][0];
            }
        }

        System.out.println("\nDías con la menor temperatura minima:");
        for (int i = 0; i < 5; i++) {
            if (temperaturas[i][0] == minTemp) {
                System.out.println("Día " + (i + 1));
            }
        }

        System.out.print("\nIngrese una temperatura para buscar coincidencias en máximas: ");
        double buscar = input.nextDouble();
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            if (temperaturas[i][1] == buscar) {
                System.out.println("Coincidencia en el día: " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron coincidencias.");
        }
        input.close();
    }
}