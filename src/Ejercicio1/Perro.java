
package Ejercicio1;

import java.util.Comparator;


public class Perro {
    private String raza , nombre;

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }
    
    public Perro(){
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " es de raza: " + raza;
    }
    
   public static Comparator<Perro> compareName = new Comparator<Perro>() {// Metodo para comparar nombres
		@Override
		public int compare(Perro p1, Perro p2) {// Paso por parametros 2 objetos
			return p1.getNombre().compareToIgnoreCase(p2.getNombre());// Comparo los nombre iguales retorna 0
							
            
}
   };
}
           
   
           
