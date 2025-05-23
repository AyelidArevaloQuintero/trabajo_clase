import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int n = input.nextInt();

        int contador1 = 0;
        int contador2 = 0;
        double gastoTotal = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Sueldo del empleado " + i + ": ");
            double sueldo = input.nextDouble();

            if (sueldo >= 100 && sueldo <= 300) {
                contador1++;
            } else if (sueldo > 300) {
                contador2++;
            }

            gastoTotal += sueldo;
        }

        System.out.println("\nEmpleados con sueldo entre $100 y $300: " + contador1);
        System.out.println("Empleados con sueldo mayor a $300: " + contador2);
        System.out.printf("Gasto total en sueldos: $%.2f\n", gastoTotal);

        input.close();
    }
}
