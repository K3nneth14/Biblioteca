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
## Cómo Ejecutar el Código

1. **Clonar el Repositorio**

Primero, clonar el repositorio enmáquina local utilizando Git, se puede hacerlo con el comando `git clone`, seguido de la URL del repositorio.

2. **Compilar el Código**

Una vez que se haya clonado el repositorio, navega al directorio del proyecto utilizando la terminal o línea de comandos. Luego, compila el código fuente usando el compilador de Java. Este paso convertirá los archivos fuente `.java` en archivos `.class` que pueden ser ejecutados.

3. **Ejecutar el Código**

Después de compilar el código, se puede ejecutar la aplicación, utilizando el comando para ejecutar la clase principal del proyecto. Esto iniciará el programa y se podrá ver cómo funciona el sistema de gestión de la biblioteca.

Asegurarse de tener Java instalado en tu máquina para compilar y ejecutar el código. Si no lo tienes, puedes descargarlo e instalarlo desde el sitio web oficial de Oracle.


## Usos del Código

1. **Crear Instancias de Libros**

Primero, se puede crear instancias de libros especificando el título y el autor. Por ejemplo, puedes crear un libro titulado "Cien años de soledad" de Gabriel García Márquez y otro libro titulado "Don Quijote de la Mancha" de Miguel de Cervantes.

2. **Crear una Instancia de Usuario**

Luego, crea una instancia de usuario con un nombre, como "Juan Pérez". Este usuario podrá tomar prestados y devolver libros.

3. **Prestar Libros**

El usuario puede tomar prestado un libro si está disponible. Una vez prestado, el libro se marcará como no disponible y se añadirá a la lista de libros prestados del usuario.

4. **Devolver Libros**

Cuando el usuario devuelva un libro, este se marcará como disponible nuevamente y se eliminará de la lista de libros prestados del usuario.

5. **Listar Libros Prestados**

 El usuario puede consultar todos los libros que ha tomado prestados en cualquier momento. Esto mostrará una lista de los libros que el usuario tiene actualmente en su posesión.




