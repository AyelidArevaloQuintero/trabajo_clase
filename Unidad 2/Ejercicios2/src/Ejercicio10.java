import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el sueldo: ");
        double sueldo = input.nextDouble();

        System.out.print("Ingrese los años de antigüedad: ");
        int antiguedad = input.nextInt();

        if (sueldo < 500) {
            if (antiguedad >= 10) {
                sueldo = sueldo * 1.20;  // Aumento del 20%
            } else {
                sueldo = sueldo * 1.05;  // Aumento del 5%
            }
            System.out.println("Sueldo con aumento: " + sueldo);
        } else {
            System.out.println("Sueldo sin cambios: " + sueldo);
        }

        input.close();
    }
}
