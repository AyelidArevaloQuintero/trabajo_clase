import java.util.ArrayList;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        while (true) {
            System.out.print("Ingresa el nombre del alumno (o * para terminar): ");
            String nombre = input.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Ingresa la edad de " + nombre + ": ");
            int edad = Integer.parseInt(input.nextLine());

            nombres.add(nombre);
            edades.add(edad);
        }

        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        int edadMaxima = 0;
        for (int edad : edades) {
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }

        System.out.println("\nAlumnos con la mayor edad (" + edadMaxima + " años):");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == edadMaxima) {
                System.out.println(nombres.get(i));
            }
        }

        input.close();
    }
}
