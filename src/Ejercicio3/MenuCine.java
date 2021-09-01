package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCine {

    public static void ejecutadorMenuCine() {
        int ver;
        ServicioPelicula utilidadPeli = new ServicioPelicula();
        Scanner leer = new Scanner(System.in);
        Pelicula peli;
        ArrayList<Pelicula> listaPelicula = new ArrayList<Pelicula>();
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            peli = new Pelicula();
            peli.setTitulo(leer.nextLine());
            System.out.println("Ingrese director de la pelicula");
            peli.setDirector(leer.nextLine());
            System.out.println("Ingrese la hora e la pelicula en horas");
            peli.setDuracionMin(leer.nextInt());
            peli = new Pelicula("La llamada","Morgan Freeman",3);
            listaPelicula.add(peli);
            peli = new Pelicula("El silencio mortal 666" , "Steven Morgan" , 1);
            listaPelicula.add(peli);
            System.out.println("Desea ingresar otra pelicula?");
            System.out.println("1. Otra peli, 0- Salir");
            ver = leer.nextInt();
            leer.nextLine();
        }while (ver !=0);
    
        System.out.println("---------------------||||---------------------");
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
		System.out.println("---------------------||||---------------------");
		utilidadPeli.mostrarHorasMayorAUno(listaPelicula);
		System.out.println("---------------------||||---------------------");
		System.out.println("ORDENO DE MENOR A MAYOR DURACION");
		listaPelicula.sort(ServicioPelicula.peliMenorToMayor);
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
		System.out.println("---------------------||||---------------------");
		System.out.println("ORDENO DE MAYOR A MENOR DURACION");
		listaPelicula.sort(ServicioPelicula.peliMayorToMenor);
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
		System.out.println("---------------------||||---------------------");
		System.out.println("ORDENO ALFABETICAMENTE TITULO");
		listaPelicula.sort(ServicioPelicula.alfabeticamenteTitulo);
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
		System.out.println("---------------------||||---------------------");
		System.out.println("ORDENO ALFABETICAMENTE DIRECTOR");
		listaPelicula.sort(ServicioPelicula.alfabeticamenteDirector);
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
   
   
   
    }

}
