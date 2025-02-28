import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double numUno = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numDos = scanner.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        double numTres = scanner.nextDouble();

        double suma = 0;

        suma = numUno + numDos + numTres;
        double media = suma / 3;

        System.out.println("El resultado es: " + media);
    }
    
}
