// clase Libro
package eje_402;

public class Libro {

// atributos titulo, autor, número de ejemplares del libro y número de ejemplares prestados
    private String titulo;
    private String autor;
    private int numero_ejemplares;
    private int numero_prestados;

    public Libro(String titulo, String autor, int numero_ejemplares, int numero_prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_ejemplares = numero_ejemplares;
        this.numero_prestados = numero_prestados;
    }

// metodos: prestamo, devolucion, toString
    public boolean prestamo() {
        if (this.numero_prestados < this.numero_ejemplares) {
            this.numero_prestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (this.numero_prestados > 0) {
            this.numero_prestados--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numero_ejemplares=" + numero_ejemplares + ", numero_prestados=" + numero_prestados + '}';
    }

}
