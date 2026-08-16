package actividad1_ejercicio2;
class Prestamo {
    String Estudiante;
    String libro;
    String fechaPrestamo;
    String fechaDevolucion;
    boolean devuelto;

    public Prestamo(String Estudiante, String libro, String fechaPrestamo, String fechaDevolucion, boolean devuelto ) {
        this.Estudiante = Estudiante;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = devuelto;

    }     public void devolverLibro() {
            devuelto = true;
            System.out.println("Libro devuelto correctamente");

        }

        public boolean estaDevuelto() {
            return devuelto;

    }

    public void MostrarPrestamo() {
        System.out.println("Estudiante: " + Estudiante);
        System.out.println("Libro: " + libro);
        System.out.println("Fecha de prestamo: " + fechaPrestamo);
        System.out.println("Fecha de devolucion: " + fechaDevolucion);
        System.out.println("Devuelto: " + devuelto);





    }



    }




























public class Main {
    public static void main(String[] args) {

        Prestamo prestamo1 = new Prestamo("Martin", "El Principito", "16-08-2026", "30-08-2026", false);
        prestamo1.MostrarPrestamo();
        prestamo1.devolverLibro();


        System.out.println();
        System.out.println(prestamo1.estaDevuelto());

        // Dejé fuera datos como la dirección del estudiante y las multas por atraso,
// porque no son necesarios para registrar un préstamo básico,
// su fecha y su estado de devolución.


    }


}
