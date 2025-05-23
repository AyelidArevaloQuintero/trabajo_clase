import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double suma = 0;
        double nota;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            nota = input.nextDouble();
            suma += nota;
        }

        double promedio = suma / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }

        input.close();
    }
}
