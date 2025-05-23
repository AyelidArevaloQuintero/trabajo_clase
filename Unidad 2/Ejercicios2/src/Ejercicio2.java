import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la primera nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingresa la segunda nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingresa la tercera nota");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3 ; 
        
       if(promedio >= 7){
          System.out.println("Promocionado");
       } else {
        System.out.println("No promocionado");
       }
       scanner.close();
    }
}
