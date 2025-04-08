public class Ejercicio2 {
    public static void main(String[] args) {
        int saldoInicial = 1000;
        int retiroSemanal = 200;
        int semanas = 4;
        
        int saldoFinal = saldoInicial - (retiroSemanal * semanas);
        System.out.println("Saldo final: " + saldoFinal);
    }
}