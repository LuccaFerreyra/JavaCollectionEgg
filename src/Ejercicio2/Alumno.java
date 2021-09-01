package Ejercicio2;

import java.util.ArrayList;

public class Alumno {

    private String nombreAlumno;
    private ArrayList<Integer> nota = new ArrayList<Integer>();

    public Alumno(String nombreAlumno, ArrayList<Integer> nota) {
        this.nombreAlumno = nombreAlumno;
        this.nota = nota;

    }

    public Alumno() {
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota.add(nota);
    }

    public void imprimir() {
        System.out.println(this.nombreAlumno);
        System.out.println("NOTAS");
        for (int i = 0; i < this.nota.size(); i++) {
            String c = (i == 0) ? " Nota " + i + "  == " + this.nota.get(i) : " //Nota " + i + " == " + this.nota.get(i);
            System.out.println(c);

        }
        System.out.println();
    }

    public int notaFinal() {
        int suma = 0;
        for (int i = 0; i < this.nota.size(); i++) {
            suma = suma + this.nota.get(i); /// sumo todas las notas
        }

        return suma / this.nota.size();
    }
}
