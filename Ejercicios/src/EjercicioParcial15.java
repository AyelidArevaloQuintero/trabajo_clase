import java.util.Scanner;

public class EjercicioParcial15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = input.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = input.nextLine();

        if (nombre1.compareToIgnoreCase(nombre2) > 0) {
            System.out.println("Nombres ordenados alfabéticamente: " + nombre2 + ", " + nombre1);
        } else {
            System.out.println("Nombres ordenados alfabéticamente: " + nombre1 + ", " + nombre2);
        }

        input.close();
    }
}