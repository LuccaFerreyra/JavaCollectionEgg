
package Ejercicio4;

import static Ejercicio4.Tienda.eliminaProducto;
import static Ejercicio4.Tienda.guardarProducto;
import static Ejercicio4.Tienda.modificaPrecio;
import static Ejercicio4.Tienda.mostrarProductos;
import java.util.HashMap;
import java.util.Scanner;


public class TiendaMain {

    public static void main(String[] args) {

        HashMap<String, Float> listaProductos = new HashMap<String, Float>();
        Scanner leer = new Scanner(System.in);
        int opcionElegida = 0;
        float precio;
        String codigo;

        while (opcionElegida != 5) {
            System.out.println("Introduce el numero de la opción que quieras:");
            System.out.println("1.- Introducir producto");
            System.out.println("2.- Modificar precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");
            opcionElegida = leer.nextInt();

            switch (opcionElegida) {
                case 1:
                    System.out.println("Introduce el códido del producto:");
                    codigo = leer.next();
                    System.out.println("Introduce el precio del producto:");
                    precio = leer.nextFloat();
                    guardarProducto(codigo, precio, listaProductos);
                    break;
                case 2:
                    System.out.println("Introduce el códido del producto del que quieres cambiar el precio:");
                    codigo = leer.next();
                    modificaPrecio(codigo, listaProductos);
                    break;
                case 3:
                    mostrarProductos(listaProductos);
                    break;
                case 4:
                    System.out.println("Introduce el códido del producto que quieres eliminar:");
                    codigo = leer.next();
                    eliminaProducto(codigo, listaProductos);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Tienes que introducir una opción valida");
            }

        }
    }
}
