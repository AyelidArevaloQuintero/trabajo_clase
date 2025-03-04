public class Ejercicio1 {
    public static void main(String[] args) {

        double precioCamiseta = 25;
        double precioPantalon = 30;
        
        double precioCamisetaDescuento = precioCamiseta * 0.85;
        double precioPantalonDescuento = precioPantalon * 0.85;
        
        double segundaCamiseta = precioCamisetaDescuento * 0.95;
        
        double total = precioCamisetaDescuento + segundaCamiseta + precioPantalonDescuento;

        System.out.println("Precio total: " + total);
    }
}