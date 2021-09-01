
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;


public class MenuPerro {
    public static void ejecutadorRazaPerro() {

        int decision = -1;
        Perro perrito;
        Scanner leer = new Scanner(System.in);
        ArrayList<Perro> p = new ArrayList<Perro>();

        do {

            System.out.println("Ingrese Nombre del perro a guardar");
            String raz = leer.next();
            perrito = new Perro();
            perrito.setNombre(raz); //guardamos el nombre del perro
            System.out.println("Ingrese raza de " + raz + " a guardar ");
            raz = leer.next();
            perrito.setRaza(raz); // paso el String a perroRaza
            p.add(perrito);
            System.out.println("Desea guardad otra raza de perro?");
            System.out.println("1 - Si , 0 - Salir");
            decision = leer.nextInt();
            leer.next();

        } while (decision != 0);
        p.forEach(System.out::println); /// se muestra el resultado por pantalla
        System.out.println("Ingrese perro a buscar en la lista para elliminar si existe");
        String nombre = leer.next();
        boolean ver = false;

        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getNombre().equalsIgnoreCase(nombre)) {
                p.remove(i);
                System.out.println(nombre + "Removido");
                i = p.size();
                ver = true;

            }

        }
        
        if(ver != true){
            System.out.println("No se encontro " + nombre + " en la lista de perros");
        
        }
        p.sort(perrito.compareName); /// Ordeno la lista por los nombres de los perros
        p.forEach(System.out::println); // muestro la lista
    }

}



