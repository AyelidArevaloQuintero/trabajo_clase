import java.util.Arrays;
import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Random random = new Random();

        System.out.println("Vector original:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100) + 1;
            System.out.print(vector[i] + " ");
        }

        Arrays.sort(vector);

        System.out.println("\n\nVector ordenado de menor a mayor:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
