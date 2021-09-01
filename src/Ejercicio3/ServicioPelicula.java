package Ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;

class ServicioPelicula {

    public void mostrarPelisCompletas(ArrayList<Pelicula> peli) {
        for (int i = 0; i < peli.size(); i++) {
            System.out.println("Datos Pelicula " + i);
            System.out.println("Titulo: " + peli.get(i).getTitulo());
            System.out.println("Director " + peli.get(i).getDirector());
            System.out.println("Duracion " + peli.get(i).getDuracionMin() + "h");

        }

    }

    public void mostrarHorasMayorAUno(ArrayList<Pelicula> peli) {
        for (int i = 0; i < peli.size(); i++) {
            if (peli.get(i).getDuracionMin() > 1) {
                System.out.println("Datos Pelicula con duracion mayor 1Hs");
                System.out.println("Titulo: " + peli.get(i).getTitulo());
                System.out.println("Director: " + peli.get(i).getDirector());
                System.out.println("Duracion: " + peli.get(i).getDuracionMin() + "h");
            }

        }

    }

    public static Comparator<Pelicula> peliMenorToMayor = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            Integer hora1 = o1.getDuracionMin();
            Integer hora2 = o2.getDuracionMin();
            return hora1.compareTo(hora2);

        }

    };
    public static Comparator<Pelicula> peliMayorToMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            Integer hora1 = o1.getDuracionMin();
            Integer hora2 = o2.getDuracionMin();
            return hora2.compareTo(hora1);

        }

    };

    public static Comparator<Pelicula> alfabeticamenteTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            String dato1 = o1.getTitulo();
            String dato2 = o2.getTitulo();
            return dato1.compareTo(dato2);

        }

    };
    public static Comparator<Pelicula> alfabeticamenteDirector = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            String dato1 = o1.getDirector();
            String dato2 = o2.getDirector();
            return dato1.compareTo(dato2);
        }
    };

}
