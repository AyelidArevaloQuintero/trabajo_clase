import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de pregutas: ");
        int numPreguntas = scanner.nextInt();
        System.out.println("Imgresa la cantidad de preguntas correctas: ");
        int correctas = scanner.nextInt();
       
        double porcentaje = (correctas * 100.0) / numPreguntas;

        if(porcentaje >= 90){
            System.out.println("Has obtenido el Nivel Maximo.");
        } else if (porcentaje >= 75 && porcentaje < 90){
            System.out.println("Has obtenido el Nivel Medio.");
        } else if (porcentaje >= 50 && porcentaje < 75){
            System.out.println("Has obtenido el Nivel Regular.");
        } else {
            System.out.println("Fuera de Nivel.");
        }
       
        scanner.close();
    }
}
