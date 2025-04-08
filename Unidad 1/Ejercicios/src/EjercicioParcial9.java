import java.util.Scanner;

public class EjercicioParcial9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        float nota1 = input.nextFloat();
        
        System.out.println("Ingrese la sgunda nota: ");
        float nota2 = input.nextFloat();
        
        System.out.println("Ingrese la tercera nota: ");
        float nota3 = input.nextFloat();
        
        float porcentaje = (nota1 + nota2 + nota3) / 3;
        
        if(porcentaje >= 7){
            System.out.println("Promocionado");
        }else if(porcentaje >= 4 && porcentaje <= 7){
            System.out.println("Regular");
        }else{
            System.out.println("Reprobado");
        }
        
        input.close();
    }
}