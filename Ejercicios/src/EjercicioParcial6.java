import java.util.Scanner;

public class EjercicioParcial6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = input.nextInt();

        if(num > 0){
            System.ot.println("El número es posiivo ");
        } else if(num < 0){
            System.out.println("El numero es negativo ");
        } else{
            System.out.println("El numero es nulo.");
        }

        input.close();
    }
}