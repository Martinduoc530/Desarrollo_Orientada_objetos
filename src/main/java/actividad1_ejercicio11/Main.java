package actividad1_ejercicio11;

class CitaMedica {

    String paciente;
    String fecha;
    String hora;
    String estado;

    public CitaMedica(String paciente, String fecha, String hora, String estado) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public void mostrarCita() {
        System.out.println("Paciente: " + paciente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Estado: " + estado);
    }

    public void completarAtencion() {

        if (!estado.equals("Atendida")) {
            estado = "Atendida";
            System.out.println("La cita fue marcada como atendida");
        } else {
            System.out.println("La cita ya fue atendida");
        }
    }

    public void cancelarCita() {

        if (!estado.equals("Atendida")) {
            estado = "Cancelada";
            System.out.println("La cita fue cancelada");
        } else {
            System.out.println("No se puede cancelar una cita ya atendida");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        CitaMedica cita1 = new CitaMedica(
                "Martin Gutierrez",
                "20-08-2026",
                "15:30",
                "Pendiente"
        );

        cita1.mostrarCita();

        System.out.println();

        cita1.completarAtencion();

        System.out.println();

        cita1.mostrarCita();


        // Dejé fuera datos como la dirección del paciente y el número de teléfono,
        // porque no son necesarios para representar una cita médica básica
        // con su fecha, hora y estado de atención.
    }
}