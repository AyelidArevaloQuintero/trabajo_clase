import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el sueldo: ");
        int sueldo = scanner.nextInt();

        if (sueldo >= 3000) {
            System.out.println("Debes abonar impuestos.");
        } else {
            System.out.println("No debes abonar impuestos.");
        }
        scanner.close();
    }
}
