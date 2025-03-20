import java.util.Scanner;

public class EjercicioParcial11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int mayores = 0;
        int menores = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese la nota: " + i + ": ");
            float nota = input.nextFloat();
            
            if (nota >= 7) {
                mayores++;
            } else {
                menores++;
            }
        }
        
        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + mayores);
        System.out.println("Cantidad de alumnos con notas menores a 7: " + menores);
        
        input.close();
    }
}