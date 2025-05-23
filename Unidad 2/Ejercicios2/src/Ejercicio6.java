import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();
       
    
        if (numero > 0) {
            System.out.println("Este numero es positivo ");
        } else if(numero == 0){
            System.out.println("Este numero es nulo");
        } else {
            System.out.println("Este numero es negativo");
        } 
        scanner.close();
    }
}
