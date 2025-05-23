import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidadNotas = 10;
        int contadorMayoresIgual7 = 0;
        int contadorMenores7 = 0;

        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = input.nextDouble();

            if (nota >= 7) {
                contadorMayoresIgual7++;
            } else {
                contadorMenores7++;
            }
        }

        System.out.println("Cantidad de alumnos con nota >= 7: " + contadorMayoresIgual7);
        System.out.println("Cantidad de alumnos con nota < 7: " + contadorMenores7);

        input.close();
    }
}
