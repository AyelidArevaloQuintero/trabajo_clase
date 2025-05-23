import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numArticulos = 5;
        int numSucursales = 4;
        
        double[] precios = new double[numArticulos];
        int[][] cantidades = new int[numSucursales][numArticulos];
        
        // Leer precios de los artículos
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.print("Precio artículo " + (i + 1) + ": ");
            precios[i] = input.nextDouble();
        }
        
        // Leer cantidades vendidas por sucursal y artículo
        System.out.println("\nIngrese las cantidades vendidas por sucursal y artículo:");
        for (int s = 0; s < numSucursales; s++) {
            System.out.println("Sucursal " + (s + 1) + ":");
            for (int a = 0; a < numArticulos; a++) {
                System.out.print("Cantidad artículo " + (a + 1) + ": ");
                cantidades[s][a] = input.nextInt();
            }
        }
        
        // Cantidades totales de cada artículo (sumando todas sucursales)
        int[] totalPorArticulo = new int[numArticulos];
        for (int a = 0; a < numArticulos; a++) {
            int suma = 0;
            for (int s = 0; s < numSucursales; s++) {
                suma += cantidades[s][a];
            }
            totalPorArticulo[a] = suma;
        }
        
        // Cantidad total de artículos en la sucursal 2 (índice 1)
        int totalSucursal2 = 0;
        for (int a = 0; a < numArticulos; a++) {
            totalSucursal2 += cantidades[1][a];
        }
        
        // Cantidad del artículo 3 en la sucursal 1 (índices 0 y 2)
        int cantidadArticulo3Sucursal1 = cantidades[0][2];
        
        // Recaudación total por sucursal
        double[] recaudacionSucursal = new double[numSucursales];
        for (int s = 0; s < numSucursales; s++) {
            double suma = 0;
            for (int a = 0; a < numArticulos; a++) {
                suma += cantidades[s][a] * precios[a];
            }
            recaudacionSucursal[s] = suma;
        }
        
        // Recaudación total de la empresa
        double recaudacionTotalEmpresa = 0;
        for (double rec : recaudacionSucursal) {
            recaudacionTotalEmpresa += rec;
        }
        
        // Sucursal de mayor recaudación
        int sucursalMayorRecaudacion = 0;
        double maxRecaudacion = recaudacionSucursal[0];
        for (int s = 1; s < numSucursales; s++) {
            if (recaudacionSucursal[s] > maxRecaudacion) {
                maxRecaudacion = recaudacionSucursal[s];
                sucursalMayorRecaudacion = s;
            }
        }
        
        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        
        System.out.println("Cantidades totales por artículo:");
        for (int a = 0; a < numArticulos; a++) {
            System.out.println("Artículo " + (a + 1) + ": " + totalPorArticulo[a]);
        }
        
        System.out.println("Cantidad total de artículos en la sucursal 2: " + totalSucursal2);
        
        System.out.println("Cantidad del artículo 3 en la sucursal 1: " + cantidadArticulo3Sucursal1);
        
        System.out.println("Recaudación total por sucursal:");
        for (int s = 0; s < numSucursales; s++) {
            System.out.printf("Sucursal %d: %.2f\n", (s + 1), recaudacionSucursal[s]);
        }
        
        System.out.printf("Recaudación total de la empresa: %.2f\n", recaudacionTotalEmpresa);
        
        System.out.println("Sucursal de mayor recaudación: Sucursal " + (sucursalMayorRecaudacion + 1));
        
        input.close();
    }
}
