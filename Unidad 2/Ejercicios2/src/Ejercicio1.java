import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        int suma = 0;
        int resta = 0;
        int producto = 0;
        int division = 0;

        if(num1 > num2){
          suma = num1 + num2;
          resta = num1 - num2;

          System.out.println("La suma es: " + suma + " y la resta es: " + resta);

        } else{
            producto = num1 * num2;
            division = num1 / num2;
            
             System.out.println("El producto es: " + producto + " y la division es: " + division);
        }
       scanner.close();
    }
}
