package actividad1_ejercicio5;

class Estudiante {

    String nombre;
    String carrera;
    double promedio;
    int semestre;

    public Estudiante(String nombre, String carrera, double promedio, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
        this.semestre = semestre;
    }

    // Método 1
    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
        System.out.println("Semestre: " + semestre);
    }

    // Método 2
    public boolean estaAprobado() {
        return promedio >= 4.0;
    }

    // Método 3
    public void actualizarPromedio(double nuevoPromedio) {
        if (nuevoPromedio >= 1.0 && nuevoPromedio <= 7.0) {
            promedio = nuevoPromedio;
            System.out.println("Promedio actualizado correctamente");
        } else {
            System.out.println("Promedio invalido");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(
                "Martin",
                "Analista Programador",
                5.2,
                2
        );

        estudiante1.mostrarEstudiante();

        System.out.println();

        System.out.println("¿Esta aprobado?: " + estudiante1.estaAprobado());

        System.out.println();

        estudiante1.actualizarPromedio(5.8);

        System.out.println();

        estudiante1.mostrarEstudiante();


        // Dejé fuera datos como la dirección y el número de teléfono del estudiante,
        // porque no son necesarios para representar su información académica básica
        // ni para consultar o actualizar su rendimiento.
    }
}