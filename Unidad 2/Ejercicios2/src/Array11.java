public class Array11 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];

        // Cargar la tabla: 1 en la diagonal, 0 en el resto
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Contenido de la tabla 'diagonal':");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
