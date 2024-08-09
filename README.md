# Sistema de Gestión de Biblioteca en Java

## Descripción

Este proyecto es un sistema básico de gestión de una biblioteca implementado en Java. Utiliza conceptos de Programación Orientada a Objetos (POO) para permitir la gestión de libros y usuarios. Los usuarios pueden tomar prestados y devolver libros.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- `Libro`: Representa un libro en la biblioteca.
- `Usuario`: Representa a un usuario que puede tomar prestados o devolver libros.
- `Main`: Contiene el método principal para ejecutar el código y probar las funcionalidades del sistema.

### Clase `Libro`

- **Atributos**:
  - `titulo`: El título del libro (String).
  - `autor`: El autor del libro (String).
  - `disponible`: Indica si el libro está disponible para ser prestado (boolean).

- **Métodos**:
  - `getTitulo()`: Devuelve el título del libro.
  - `getAutor()`: Devuelve el autor del libro.
  - `estaDisponible()`: Devuelve el estado de disponibilidad del libro.
  - `prestar()`: Marca el libro como no disponible si está disponible.
  - `devolver()`: Marca el libro como disponible.

### Clase `Usuario`

- **Atributos**:
  - `nombre`: El nombre del usuario (String).
  - `librosPrestados`: Una lista que almacena los libros que el usuario ha tomado prestados (List<Libro>).

- **Métodos**:
  - `getNombre()`: Devuelve el nombre del usuario.
  - `prestarLibro(Libro libro)`: Permite al usuario tomar prestado un libro si está disponible.
  - `devolverLibro(Libro libro)`: Permite al usuario devolver un libro.
  - `listarLibrosPrestados()`: Muestra todos los libros que el usuario tiene prestados actualmente.

### Clase `Main`

La clase `Main` contiene un ejemplo de uso del sistema:

```java
public class Main {
    public static void main(String[] args) {
        // Crear instancias de libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        // Crear una instancia de usuario
        Usuario usuario = new Usuario("Juan Pérez");

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

