import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();
       
        if(numero <= 9){
            System.out.println("El numero tiene una cifra");
        } else if (numero <= 99){
            System.out.println("El numero tiene dos cifras");
        } else if(numero <= 999){
            System.out.println("El numero tiene tres cifras");
        } else {
            System.out.println("Error");
        }
        scanner.close();
    }
}
