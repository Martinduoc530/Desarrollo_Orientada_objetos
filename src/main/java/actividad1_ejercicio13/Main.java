package actividad1_ejercicio13;

class Socio {

    String nombre;
    String plan;
    boolean pagoVigente;
    int asistencias;

    public Socio(String nombre, String plan, boolean pagoVigente, int asistencias) {
        this.nombre = nombre;
        this.plan = plan;
        this.pagoVigente = pagoVigente;
        this.asistencias = asistencias;
    }

    public void mostrarSocio() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plan: " + plan);
        System.out.println("Pago vigente: " + pagoVigente);
        System.out.println("Asistencias: " + asistencias);
    }

    public void registrarAsistencia() {

        if (pagoVigente) {
            asistencias = asistencias + 1;
            System.out.println("Asistencia registrada correctamente");
        } else {
            System.out.println("No puede ingresar: el pago no está vigente");
        }
    }

    public void renovarPago() {

        if (!pagoVigente) {
            pagoVigente = true;
            System.out.println("Pago renovado correctamente");
        } else {
            System.out.println("El pago ya se encuentra vigente");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        var socio1 = new Socio(
                "Martin",
                "Plan Mensual",
                false,
                8
        );

        socio1.mostrarSocio();

        System.out.println();

        // Intentamos entrar sin tener el pago vigente
        socio1.registrarAsistencia();

        System.out.println();

        // Renovamos el pago
        socio1.renovarPago();

        System.out.println();

        // Ahora sí debería permitir registrar la asistencia
        socio1.registrarAsistencia();

        System.out.println();

        socio1.mostrarSocio();


        // Dejé fuera datos como la dirección y el número de teléfono del socio,
        // porque no son necesarios para controlar su plan, vigencia de pago
        // ni las asistencias a los entrenamientos.
    }
}