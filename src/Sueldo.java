import java.util.Scanner;public class CalculoSueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo, descuento;

        System.out.print("Ingrese el sueldo del empleado: $");
        sueldo = sc.nextDouble();
        if (sueldo < 500 ) {descuento = 0.0;}
        else if (sueldo >= 500 && sueldo < 750) {descuento = sueldo * 0.05;}
        else {descuento = sueldo * 0.10;}
        System.out.println("El descuento es de: $" + descuento);
        sc.close();
    }
}
