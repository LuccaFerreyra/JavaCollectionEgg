package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAlumno {

    public static void ejecutarMenuAlumno() {

        Scanner leer = new Scanner(System.in);
        Alumno alumn;
        ArrayList<Alumno> listaDeAlumno = new ArrayList<Alumno>();
        int dato;

        do {

            System.out.println("Ingrese Nombre del Alumno");
            String nom = leer.next();
            alumn = new Alumno();
            alumn.setNombreAlumno(nom);
            int nota;
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota numero" + i + " del alumno" + nom);
                nota = leer.nextInt();
                alumn.setNota(nota);
            }
            listaDeAlumno.add(alumn);
            System.out.println("Desea crear otro alumno?");
            System.out.println("Ingrese 1- Si  0- No");
            dato = leer.nextInt();
            leer.next();
        } while (dato != 0);
        listaDeAlumno.forEach((p) -> p.imprimir());
        System.out.println("Ingrese nombre del alumno que desea saber su nota final");
        String nom = leer.next();
        boolean ver = false;
        int notaFinal = 0;
        for (int i = 0; i < listaDeAlumno.size(); i++) {
            if (listaDeAlumno.get(i).getNombreAlumno().equalsIgnoreCase(nom)) {
             notaFinal = listaDeAlumno.get(i).notaFinal();
             ver = true;
             i = listaDeAlumno.size();
            }

        }
       if(ver == false){
           System.out.println("No se encontro el nombre a buscar");
       
        }else{
           System.out.println("El promedio de la nota final de" + nom.toUpperCase() + " es" +notaFinal);
           
       
          }
    }
}
