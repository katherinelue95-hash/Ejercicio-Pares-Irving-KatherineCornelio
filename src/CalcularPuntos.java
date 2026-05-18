import java.util.Scanner;public class CalculoPuntos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese partidos ganados: ");
        int ganados = leer.nextInt();

        System.out.print("Ingrese partidos empatados: ");
        int empatados = leer.nextInt();

        System.out.print("Ingrese partidos perdidos: ");
        int perdidos = leer.nextInt();

        int puntosTotales = (ganados * 3) + (empatados * 1) + (perdidos * 0);
        System.out.println("\n--- Resultado ---");
        System.out.println("La cantidad de puntos obtenidos es: " + puntosTotales);

        leer.close();
    }
}

