
package actividad1_ejercicio6;

import java.util.ArrayList;

class Curso {

    String nombreCurso;
    String codigoCurso;
    int cuposMaximos;
    ArrayList<String> estudiantes;

    public Curso(String nombreCurso, String codigoCurso, int cuposMaximos) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.cuposMaximos = cuposMaximos;
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(String nombreEstudiante) {

        if (estudiantes.size() < cuposMaximos) {
            estudiantes.add(nombreEstudiante);
            System.out.println(nombreEstudiante + " fue inscrito correctamente");
        } else {
            System.out.println("No hay cupos disponibles");
        }
    }

    public boolean hayCupos() {
        return estudiantes.size() < cuposMaximos;
    }

    public void mostrarCurso() {

        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("Código del curso: " + codigoCurso);
        System.out.println("Cupos máximos: " + cuposMaximos);
        System.out.println("Estudiantes inscritos: " + estudiantes.size());

        System.out.println();
        System.out.println("Lista de estudiantes:");

        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso(
                "Programación Orientada a Objetos",
                "POO101",
                4
        );

        curso1.inscribirEstudiante("Martin");
        curso1.inscribirEstudiante("Camila");
        curso1.inscribirEstudiante("Pedro");

        System.out.println();

        curso1.mostrarCurso();

        System.out.println();

        System.out.println("¿Hay cupos?: " + curso1.hayCupos());


        // Dejé fuera datos como la sala y el horario del curso,
        // porque no son necesarios para administrar los cupos
        // ni para registrar a los estudiantes inscritos.
    }
}