import java.util.Scanner;

public class EjercicioParcial8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cantidad total de preguntas realizadas: ");
        int numPreguntas = input.nextInt();
        
        System.out.println("Cantidad de preguntas contestadas correctamente: ");
        int numCorrectas = input.nextInt();
        
        int porcentaje = (numCorrectas/numPreguntas) * 100;
        
        if(porcentaje >= 90){
            System.out.println("Alcanzo el Nivel Maximo");
        }else if (porcentaje >=75 && porcentaje <= 90){
            System.out.println("Alcanzo el Nivel Medio");
        }else if(porcentaje >= 50 && porcentaje <= 75){
            System.out.println("Alcanzo el Nivel Regular");
        } else {
            System.out.println("Esta fuera de nivel");
        }
        
        input.close();
    }
}