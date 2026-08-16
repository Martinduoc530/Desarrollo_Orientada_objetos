package actividad1_ejercicio1;

class Libro {
String Autor;
int cantidadlibros;
String Cuento;
int precio;

public Libro(String Autor, int cantidadlibros, String Cuento, int precio) {
    this.Autor = Autor;
    this.cantidadlibros = cantidadlibros;
    this.Cuento = Cuento;
    this.precio = precio;
}

public boolean Libros() {
    if (cantidadlibros > 0) {
        return true;
    } else {
        return false;

    }
}

public void Prestamo() {
    if (cantidadlibros > 1) {
        cantidadlibros = cantidadlibros - 1;
        System.out.println("Prestamo exitoso");
    } else {
        System.out.println("No se realizo el prestamo");
    }


}

public void Devolver() {
    cantidadlibros = cantidadlibros + 1;
    System.out.println("Libro devuelto exitosamente");



}

        }













public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Isabel allende", 2, "La Casa de los espiritus", 3000 );
        libro1.Prestamo();
        System.out.println(libro1.Libros());
        libro1.Devolver();

        System.out.println();


        Libro libro2 = new Libro("Walter issacson", 0, "Historia de Steve Jobs", 4000);
        libro2.Prestamo();
        System.out.println(libro2.Libros());
        libro2.Devolver();

        System.out.println();

        // y en mi opinion, deje fuera el tamano fisico y el tipo de
        // papel, porque no son totalmente necesarios para gestionar
        // los prestamos ni la disponibilidad, ya que el tipo de papel
        // y el tamano fisico, no influyen esas funciones del sistema.



    }

}
