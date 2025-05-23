import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("Ingresa los valores para el vector1:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = input.nextInt();
        }

        System.out.println("Ingresa los valores para el vector2:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("Resultado de vector3 = vector1 + vector2:");
        for (int i = 0; i < 5; i++) {
            System.out.println("vector3[" + i + "]: " + vector3[i]);
        }

        input.close();
    }
}
