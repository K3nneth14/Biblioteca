/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenneth
 */
public class Usuario {
    private String nombre;
    private List<Libro> librosPrestados;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    // Método getter
    public String getNombre() {
        return nombre;
    }

    // Métodos para prestar y devolver libros
    public void prestarLibro(Libro libro) {
        if (libro.estaDisponible()) {
            libro.prestar();
            librosPrestados.add(libro);
            System.out.println(nombre + " ha tomado prestado \"" + libro.getTitulo() + "\".");
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no está disponible.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver();
            librosPrestados.remove(libro);
            System.out.println(nombre + " ha devuelto \"" + libro.getTitulo() + "\".");
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no está en la lista de libros prestados.");
        }
    }

    public void listarLibrosPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println(nombre + " no tiene libros prestados.");
        } else {
            System.out.println(nombre + " tiene los siguientes libros prestados:");
            for (Libro libro : librosPrestados) {
                System.out.println("- \"" + libro.getTitulo() + "\" de " + libro.getAutor());
            }
        }
    }
}
