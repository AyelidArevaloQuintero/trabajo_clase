import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número de mes (1-12): ");
        int numeroMes = input.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            int indice = numeroMes - 1;
            System.out.println("El mes es " + nombresMeses[indice] + " y tiene " + diasMeses[indice] + " días.");
        } else {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        }

        input.close();
    }
}
