import java.util.Scanner;

public class EjercicioParcial5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int num1 = input.nextInt();

        System.out.println("Ingresa el segundo numero");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es mayor");
        }else{
            System.out.println("El segundo numero es mayor");
        }

        input.close();
    }
}
