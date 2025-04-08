import java.util.Scanner;

public class EjercicioParcial10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el sueldo: ");
        float sueldo = input.nextFloat();
        
        System.out.println("Ingrese los años de antiguedad: ");
        float numAños = input.nextFloat();
        
        if(sueldo < 500 && numAños > 10){
            float promedio = 0.20f;
            float aumento = (sueldo * promedio) + sueldo;
            System.out.println("Sueldo a pagar: " + aumento);
        } else if(sueldo < 500 && numAños < 10){
            float promedio = 0.5f;
            float aumento = (sueldo * promedio) + sueldo;
            System.out.println("Sueldo a pagar: " + aumento);
        }else{
            System.out.println("Usted no tiene aumento");
        }
       
        input.close();
    }
}