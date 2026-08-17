package actividad1_ejercicio10;

class Paciente {

    String nombre;
    int edad;
    String rut;
    String motivoConsulta;

    public Paciente(String nombre, int edad, String rut, String motivoConsulta) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.motivoConsulta = motivoConsulta;
    }

    public void mostrarPaciente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("RUT: " + rut);
        System.out.println("Motivo de consulta: " + motivoConsulta);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void actualizarMotivoConsulta(String nuevoMotivo) {
        if (!nuevoMotivo.isEmpty()) {
            motivoConsulta = nuevoMotivo;
            System.out.println("Motivo de consulta actualizado");
        } else {
            System.out.println("El motivo de consulta no puede estar vacío");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        var paciente1 = new Paciente(
                "Martin Gutierrez",
                22,
                "20.123.456-7",
                "Dolor de cabeza"
        );

        paciente1.mostrarPaciente();

        System.out.println();

        System.out.println("¿Es mayor de edad?: " + paciente1.esMayorDeEdad());

        System.out.println();

        paciente1.actualizarMotivoConsulta("Control general");

        System.out.println();

        paciente1.mostrarPaciente();


        // Dejé fuera información como la dirección y el número de teléfono,
        // porque no son necesarios para identificar al paciente ni para
        // representar de forma básica la información relevante de su atención.
    }
}