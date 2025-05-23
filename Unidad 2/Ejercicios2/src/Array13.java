import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numConductores = 3;  // Puedes cambiar el número de conductores
        int diasSemana = 7;
        
        String[] nombres = new String[numConductores];
        int[][] kms = new int[numConductores][diasSemana];
        int[] total_kms = new int[numConductores];
        
        // Leer nombres y kilómetros diarios
        for (int i = 0; i < numConductores; i++) {
            System.out.print("Nombre del conductor " + (i + 1) + ": ");
            nombres[i] = input.nextLine();
            
            for (int j = 0; j < diasSemana; j++) {
                System.out.print("Kilómetros del día " + (j + 1) + ": ");
                kms[i][j] = input.nextInt();
            }
            input.nextLine();  // Consumir el salto de línea pendiente
        }
        
        // Calcular total de kilómetros por conductor
        for (int i = 0; i < numConductores; i++) {
            int suma = 0;
            for (int j = 0; j < diasSemana; j++) {
                suma += kms[i][j];
            }
            total_kms[i] = suma;
        }
        
        // Mostrar resultados
        System.out.println("\nKilómetros totales por conductor:");
        for (int i = 0; i < numConductores; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i] + " km");
        }
        
        input.close();
    }
}
