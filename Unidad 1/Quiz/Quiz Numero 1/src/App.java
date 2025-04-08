import java.util.Scanner;

public class TrianguloNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        scanner.close();
        
        if (n <= 0) {
            System.out.println("Debe ingresar un numero positivo.");
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            // Parte creciente
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            // Parte decreciente
            for (int j = n - 1; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
