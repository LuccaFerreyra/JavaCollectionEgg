
package Ejercicio3;


public class Pelicula {
    
    private String titulo;
    private String director;
    private Integer duracionMin;

   

    public Pelicula(String titulo, String director, Integer duracionMin) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMin = duracionMin;
    }
    
     public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(Integer duracionMin) {
        this.duracionMin = duracionMin;
    }
    
    
}
