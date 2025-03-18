import java.util.Scanner;

public class EjercicioParcial4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su sueldo");
        int sueldo = input.nextInt();

        if (sueldo > 3000) {
            System.out.println("Debes abonar impuestos");
        }else{
            System.out.println("No debes abonar impuestos");
        }

        input.close();
    } 
}
