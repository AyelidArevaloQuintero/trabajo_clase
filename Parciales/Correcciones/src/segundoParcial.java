import java.util.Random;
import java.util.Scanner;

public class segundoParcial {

    public static void main(String[] args) {
        int[][] laberinto = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar el laberinto con valores aleatorios del 1 al 9
        for (int fila = 0; fila < laberinto.length; fila++) {
            for (int col = 0; col < laberinto[fila].length; col++) {
                laberinto[fila][col] = random.nextInt(9) + 1;
            }
        }

        // Mostrar el laberinto generado
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        // Ejecutar los métodos
        contarParesMayoresA4(laberinto);
        promedioImpares(laberinto);
        sumaFilas(laberinto);
        mayorNumero(laberinto);

        scanner.close();
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void contarParesMayoresA4(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 == 0 && valor > 4) {
                    contador++;
                }
            }
        }
        System.out.println("Cantidad de números pares mayores a 4: " + contador);
    }

    public static void promedioImpares(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    suma += valor;
                    contador++;
                }
            }
        }
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("Promedio de números impares: " + promedio);
        } else {
            System.out.println("No hay números impares en el laberinto.");
        }
    }

    public static void sumaFilas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("Suma de la fila " + i + ": " + suma);
        }
    }

    public static void mayorNumero(int[][] matriz) {
        int max = matriz[0][0];
        int filaMax = 0;
        int colMax = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    filaMax = i;
                    colMax = j;
                }
            }
        }

        System.out.println("El mayor número es " + max + " y está en la posición [" + filaMax + "][" + colMax + "].");
    }
}

