package Ejercicio5;

import java.util.TreeSet;

public class Pais implements Comparable<Pais> {

    private String nombrePais;

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Pais() {
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombrePais == null) ? 0 : nombrePais.hashCode());
        return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Pais other = (Pais) obj;
        if (nombrePais == null) {
            if (other.nombrePais != null) {
                return false;
            }

        } else if (!nombrePais.equals(other.nombrePais)) {
            return false;
        }
        return true;

    }

    @Override
    public int compareTo(Pais o) {
        return this.nombrePais.compareToIgnoreCase(o.getNombrePais());

    }

    public TreeSet<Pais> eliminarPais(TreeSet<Pais> pi, String n) {
        java.util.Iterator<Pais> it = pi.iterator();
        while (it.hasNext()) {
            Pais nom = it.next();
            if(nom.getNombrePais().equalsIgnoreCase(n)){
            it.remove();
            
            }
        }
return pi;
    }

}
