import java.util.Scanner;

public class EjercicioParcial3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero positivo: ");
        int num = input.nextInt();

        if (num >= 10 && num <= 99) {
            System.out.println("El numero ingresado tiene dos digitos ");
        } else {
            System.out.println("El numero ingresado solo tiene un digito");
        }
        input.close();
    }
}
