import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas = new double[5];

        System.out.println("Ingresa la nota: ");
        for(int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }
        
        double suma = 0;
        double menor = notas[0];
        double mayor = notas[0];

        for(int i = 0; i < notas.length; i++){
            suma += notas[i];

            if(notas[i] >mayor){
                mayor = notas[i;]
            }

            if(notas[i] < menor){
                menor = notas[i];
            }
        }

        double media = suma / notas.length;

        System.out.println("Notas ingresadas");
        for(int i = 0; i < notas.length; i++){
            System.out.println("Notas " + (i + 1) + ": " + notas [i]);
        }

        System.out.println("Nota media: " + media);
        System.out.println("Nota mas alta: " + mayor);
        System.out.println("Nota mas baja: " + menor);

        input.close();
    }
}