package proyectofinalTorres;
import java.util.Scanner;
public class ProyectoFinalTorres {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        double compra1, compra2, compra3, totalcompras, promediocompras;
        // ingreso de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el correo del cliente: ");
        String correo = sc.nextLine();
        System.out.print("Ingrese el valor de la compra 1: ");
        compra1 = sc.nextDouble();
        System.out.print("Ingrese el valor de la compra 2: ");
        compra2 = sc.nextDouble();
        System.out.print("Ingrese el valor de la compra 3: ");
        compra3 = sc.nextDouble();

        // proceso de datos
        totalcompras = compra1 + compra2 + compra3;
        promediocompras = totalcompras / 3;

        // Salida de datos
        System.out.println("Cliente: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Total de compras   : " + totalcompras);
        System.out.println("Promedio de compras: " + promediocompras);
    }
    
}
