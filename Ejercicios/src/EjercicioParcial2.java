import java.util.Scanner;

public class EjercicioParcial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese Nota1: ");
        float nota1 = input.nextFloat();

        System.out.println("ingrese Nota2: ");
        float nota2 = input.nextFloat();

        System.out.println("ingrese Nota3: ");
        float nota3 = input.nextFloat();

        float promedio = (nota1 + nota2 + nota3) / 3;
        float num = 7.0f;

        if (promedio >= num) {
            System.out.println("Promocionado");
        } else{
            System.out.println("No has sido promocionado");
        }

        input.close();
    }
}