import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numPartidos = 15;

        // Tabla de equipos: 15 filas (partidos), 2 columnas (equipo local y visitante)
        String[][] equipos = new String[numPartidos][2];
        
        // Tabla de resultados: 15 filas (partidos), 2 columnas (goles equipo local, goles equipo visitante)
        int[][] resultados = new int[numPartidos][2];

        // Leer nombres de los equipos para cada partido
        System.out.println("Ingrese los nombres de los equipos para cada partido:");
        for (int i = 0; i < numPartidos; i++) {
            System.out.println("Partido " + (i + 1) + ":");
            System.out.print("Equipo local: ");
            equipos[i][0] = input.nextLine();
            System.out.print("Equipo visitante: ");
            equipos[i][1] = input.nextLine();
        }

        // Leer resultados (goles) para cada partido
        System.out.println("\nIngrese los resultados (goles) de cada partido:");
        for (int i = 0; i < numPartidos; i++) {
            System.out.println("Resultado Partido " + (i + 1) + " (" + equipos[i][0] + " vs " + equipos[i][1] + "):");
            System.out.print("Goles " + equipos[i][0] + ": ");
            resultados[i][0] = input.nextInt();
            System.out.print("Goles " + equipos[i][1] + ": ");
            resultados[i][1] = input.nextInt();
            input.nextLine(); 
        }

        // Mostrar resultados de todos los partidos
        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < numPartidos; i++) {
            System.out.println("Partido " + (i + 1) + ": " 
                + equipos[i][0] + " " + resultados[i][0] 
                + " - " + resultados[i][1] + " " + equipos[i][1]);
        }

        input.close();
    }
}
