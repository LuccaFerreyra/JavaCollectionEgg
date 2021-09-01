package Ejercicio5;

import java.util.Scanner;
import java.util.TreeSet;

public class MenuPais {

    public static void ejetarMeniPais() {
        TreeSet<Pais> pai = new TreeSet<Pais>();
        Scanner leer = new Scanner(System.in);
        int ver = -1;
        String p;
        do {
            System.out.println("Ingrese un pais");
            p = leer.nextLine();
            pai.add(new Pais(p));
            System.out.println("Desea aagregar otro pais digite 1 si no digite 0");
            ver = leer.nextInt();
            leer.nextLine();

        } while (ver != 0);
        System.out.println("Paises ordenado alfabeticamente");
        pai.forEach((f) -> System.out.println(f.getNombrePais()));
        System.out.println("Ingrese pais a eliminara del conjunto");
        String nom = leer.nextLine();
        Pais pin = new Pais();
        int a = pai.size();
        pin.eliminarPais(pai, nom);
        int b = pai.size();
        String con = (a != b) ? "Se elimino el pais " + nom.toUpperCase() + " de la lista" : "No se encoontro el pais " + nom.toUpperCase() + " en la lista para elimar";
        System.out.println(con);
        System.out.println("Paises ordenado alfabeticamente");
        pai.forEach((f) -> System.out.println(f.getNombrePais()));
        
        
    }

}
