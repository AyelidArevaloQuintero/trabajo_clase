public class EjerciciosArray1 {
    public static void main(String[] args) {
        // Declarar e inicializar una matriz de 3x3
        int[][] matriz = {
            {1, 6, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir todos los elementos de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            } 
            System.out.println(matriz[i]); // Salto de línea para cada fila
        }
    }
}
