import java.util.Scanner;

public class EjercicioParcial12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados: ");
        int numEmpleados = input.nextInt();
        
        int sueldoMenor = 0;
        int sueldoMayor = 0;
        int importe = 0;
        
        for(int i = 1; i <= numEmpleados; i++){
            System.out.println("Ingrese el sueldo del empleado " + i);
            int sueldo = input.nextInt();
            importe += sueldo;
            
            if(sueldo >= 100 && sueldo <= 300){
                sueldoMenor++;
            } else{
                sueldoMayor++;
            }
            
        }
        System.out.println("Sueldo entre 100 y 300: " + sueldoMenor);
        System.out.println("Sueldo mayor  300: " + sueldoMayor);
        System.out.println("Importe total gastado en sueldos: " + importe);
        
        input.close();
    }
}