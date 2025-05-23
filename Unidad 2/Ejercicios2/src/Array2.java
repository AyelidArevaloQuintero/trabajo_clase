import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vector = new String[5];

        System.out.println("Ingresa una palabra: ");
        for(int i =0; i < vector.length; i++){
            System.out.print("Palabra " + (i + 1) + ": ");
            vector[i] = scanner.nextLine();
        }

        String[] nuevoVector = new String[5];
        for(int i = 0; i < vector.length; i++){
            nuevoVector[i] = vector[vector.length - 1 - i];
        }

        System.out.println("Vector en orden inverso:");
        for(int i = 0; i < nuevoVector.length; i++){
            System.out.println("Palabra " + (i + 1) + ": " + nuevoVector[i]);
        }
        scanner.close();
    }
}