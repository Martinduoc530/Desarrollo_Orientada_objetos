package actividad_1_2_4_ejercicio4;

class Conductor {

    private String nombre;
    private String licencia;
    private int edad;
    private boolean habilitado;

    public Conductor(String nombre, String licencia, int edad, boolean habilitado) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.edad = edad;
        this.habilitado = habilitado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    // Método 1
    public void mostrarConductor() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
        System.out.println("Edad: " + edad);
        System.out.println("Habilitado: " + habilitado);
    }

    // Método 2
    public boolean puedeConducir() {
        return edad >= 18 && habilitado;
    }

    // Método 3
    public void suspenderLicencia() {

        if (habilitado) {
            habilitado = false;
            System.out.println("Licencia suspendida");
        } else {
            System.out.println("La licencia ya estaba suspendida");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Conductor conductor1 = new Conductor(
                "Martin Gutierrez",
                "Clase B",
                18, true
        );

        conductor1.mostrarConductor();

        System.out.println();

        System.out.println("¿Puede conducir?: " + conductor1.puedeConducir());

        System.out.println();

        conductor1.suspenderLicencia();

        System.out.println();

        System.out.println("¿Puede conducir ahora?: " + conductor1.puedeConducir());

        System.out.println();

        conductor1.mostrarConductor();

        // mi justificacion:  La clase Conductor representa la información necesaria para identificar
// a una persona autorizada para conducir. Se seleccionaron datos como nombre,
// licencia, edad y estado de habilitación para determinar si puede conducir.




    }
}