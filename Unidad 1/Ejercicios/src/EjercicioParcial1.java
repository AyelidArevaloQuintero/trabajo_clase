import java.util.Scanner;

public class EjercicioParcial1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        float num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        float num2 = input.nextInt();

        if(num1 > num2){
            float suma = num1 + num2;
            float resta = num1 - num2;

            System.out.println("La suma es: " + suma + " y la resta es: " + resta);
        } else {
            float producto = num1 * num2;
            float division = num1 / num2;
            System.out.println("El producto es: " + producto + " y la division es: " + division);
        }

        input.close();
    }
    
}
