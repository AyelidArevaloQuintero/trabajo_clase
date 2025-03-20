import java.util.Scanner;

public class EjercicioParcial7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int num = input.nextInt();

        if(num >= 0 && num <= 9){
            System.out.println("Este numero tiene un digito");
        } else if(num >= 10 && num <=99){
            System.out.println("Este numero tiene dos digitos");
        }else if(num >= 100 && num <= 999){
            System.out.println("Este numero tiene tres digitos");
        }else{
            System.out.println("Error");
        }

        input.close();
    }
}