package actividad1_ejercicio12;

class BusEscolar {

    String recorrido;
    int capacidadMaxima;
    int pasajeros;
    boolean enServicio;

    public BusEscolar(String recorrido, int capacidadMaxima, int pasajeros, boolean enServicio) {
        this.recorrido = recorrido;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajeros = pasajeros;
        this.enServicio = enServicio;
    }

    public void mostrarBus() {
        System.out.println("Recorrido: " + recorrido);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Pasajeros actuales: " + pasajeros);
        System.out.println("En servicio: " + enServicio);
    }

    public void subirPasajero() {

        if (enServicio && pasajeros < capacidadMaxima) {
            pasajeros = pasajeros + 1;
            System.out.println("Pasajero ingresado correctamente");
        } else {
            System.out.println("No se pudo ingresar al pasajero");
        }
    }

    public void cambiarEstado() {
        enServicio = !enServicio;

        System.out.println("Estado del bus actualizado");
    }
}


public class Main {

    public static void main(String[] args) {

        BusEscolar bus1 = new BusEscolar(
                "Colegio - Sector Norte",
                30,
                28,
                true
        );

        bus1.mostrarBus();

        System.out.println();

        bus1.subirPasajero();

        System.out.println();

        bus1.mostrarBus();

        System.out.println();

        bus1.cambiarEstado();

        System.out.println();

        bus1.mostrarBus();


        // Dejé fuera información como el color del bus y la marca del vehículo,
        // porque no son necesarias para controlar su capacidad, recorrido
        // ni su estado dentro del sistema escolar.
    }
}