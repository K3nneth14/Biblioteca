/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Kenneth
 */

public class Main {
    public static void main(String[] args) {
        // Crear instancias de libros
        Libro libro1 = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        // Crear una instancia de usuario
        Usuario usuario = new Usuario("Juan Perez");

        // Préstamo de libros
        usuario.prestarLibro(libro1);
        usuario.prestarLibro(libro2);

        // Listar libros prestados
        usuario.listarLibrosPrestados();

        // Devolución de un libro
        usuario.devolverLibro(libro1);
        usuario.listarLibrosPrestados();
    }
}
